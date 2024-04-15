package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz1 {
    public static void main(String[] args) {
        try {
            // 서버 소켓 생성 및 포트 바인딩
            ServerSocket sck = new ServerSocket(12345);
            System.out.println("서버가 시작되었습니다. 클라이언트의 연결을 기다립니다...");

            // 클라이언트의 연결을 기다림
            Socket client = sck.accept();
            System.out.println("클라이언트가 연결되었습니다.");

            // 입출력 스트림 생성
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            // 클라이언트로부터 메시지를 읽고, 읽은 메시지를 다시 전송
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("클라이언트로부터 받은 메시지: " + message);

                // 클라이언트에게 응답 전송
                out.println("\n서버가 응답하는 메시지: " + message);
            }

            // 연결 종료
            in.close();
            out.close();
            client.close();
            sck.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

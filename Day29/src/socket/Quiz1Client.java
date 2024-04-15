package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Quiz1Client {
    public static void main(String[] args) {
        try {
            // 서버에 연결
            Socket socket = new Socket("192.168.112.10", 12345);
            System.out.println("서버에 연결되었습니다.");

            // 입출력 스트림 생성
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 사용자로부터 입력을 받아 서버에 전송
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while ((message = userInput.readLine()) != null) {
                // 서버로 메시지 전송
                out.println(message);

                // 서버로부터 받은 응답 출력
                System.out.println("서버 응답: " + in.readLine());
            }

            // 연결 종료
            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 단반향 메시지 전송
// 클라이언트 -> 서버
public class Ex02 {
	public static void main(String[] args) throws IOException {
		ServerSocket ssk = new ServerSocket(11000);
		
		System.out.println("서버 on , 연결대기중");
		
		Socket client = ssk.accept();
		System.out.println("클라이언트 연결됨");
		
		// 클라이언트가 전송한 데이터가 있는 입력 스트림을 하나 받는다
		Scanner sc = new Scanner(client.getInputStream());
		
		// 클라이언트가 연결을 끊으면 아래 조건이 거짓이 된다
		while(sc.hasNextLine()) {
			System.out.println("클라이언트 : " + sc.nextLine());
		}
		
		client.close();
		ssk.close();
		
		System.out.println("\n연결이 종료되었습니다");
	}
}

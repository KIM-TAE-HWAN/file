package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Quiz01Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("192.168.112.10", 12000);
		System.out.println("서버에 연결됨");
		
		// 서버에 보내기 위한 객체
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		Scanner sc = new Scanner(System.in);
		String clientMsg;
		
		// 서버에서 받기 위한 객체
		Scanner input = new Scanner(client.getInputStream());
		String serverMsg;
		
		do {
			System.out.println("\n전송 :");
			clientMsg = sc.nextLine();
			
			pw.println(clientMsg);
			
			
				serverMsg = input.nextLine();
				System.out.println("\n서버 : " + serverMsg);

			
		} while ("0".equals(clientMsg) == false);
		
			
		client.close();
		System.out.println("접속 종료");
	}
}

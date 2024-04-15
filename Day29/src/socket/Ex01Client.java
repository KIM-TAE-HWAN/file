package socket;

import java.io.IOException;
import java.net.Socket;

public class Ex01Client {
	public static void main(String[] args) throws IOException {
		//Socket client = new Socket("127.0.0.7", 10000);
		Socket client = new Socket("192.168.112.20", 10000);
		System.out.println("서버에 연결 되었습니다");
		
		client.close();
		System.out.println("\n연결 해제");
	}
}

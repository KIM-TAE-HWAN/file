package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
	소켓(socket)
	- 네트워크 통신을 가능하게 하는 프로그래밍 인터페이스를 의미
	- java는 socket이란느 객체를 제공 중
	
	자바의 클라이언트
	1. server : service를 제공하는 자 ex) 네이버 등
	2. client : service를 이용하는 자 ex) 나
	
	※ service
	- 어떠한 기능(=프로그램)을 제 3자에게 제공하는 것
*/
public class Ex01 {
	public static void main(String[] args) throws IOException {
		// 자바 소켓 생성시 접속할 포트 번호를 지정
		ServerSocket ssk = new ServerSocket(10000);
		
		System.out.println("서버 on. 연결 대기중");
		Socket client = ssk.accept(); // client 소켓 생성
		
		System.out.println("\n클라이언트가 연결되었습니다");
		System.out.println("접속 ip : " + client.getInetAddress());
		System.out.println("접속 port : " + client.getPort());
		
		
		
		// 통신이 끝난 후에는 소켓을 제거
		System.out.println("\n접속에 해제되었습니다");
		client.close();
		ssk.close();
	}
}

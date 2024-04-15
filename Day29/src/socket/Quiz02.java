package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 쓰레드를 활용한 양방향 통신 (=전이중)
class Test2 implements Runnable {
	private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;

    public Test2(Socket socket) {
        this.clientSocket = socket;
        try {
           
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	@Override
	public void run() {
		 try {
	            
	            String message;
	            while ((message = in.readLine()) != null) {
	                System.out.println("클라이언트로부터 받은 메시지: " + message);

	                
	                out.println("서버가 응답하는 메시지: " + message);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	               
	                in.close();
	                out.close();
	                clientSocket.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	           }
	     }
	}
}

public class Quiz02 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(13000);
		System.out.println("서버 on, 연결 대기 중");
		
		Socket client = server.accept();
		System.out.println("클라이언트 연결");
		
		// 클라이언트에 보내기 위한 객체
		PrintWriter pw = new PrintWriter(client.getOutputStream());
		Scanner sc = new Scanner(System.in);
		String serverMsg;
		
		// 클라이언트에서 받기 위한 객체
		Scanner input = new Scanner(client.getInputStream());
		String clientMsg;
		
		while(input.hasNextLine()) {
			clientMsg = input.nextLine();
			System.out.println("클라 : " + clientMsg);
			
			//따로
			System.out.println("\n전송 : ");
			serverMsg = sc.nextLine();
			
			pw.println(serverMsg);
		}		
		
		client.close();
		server.close();
		System.out.println("연결 종료");
	}	
}

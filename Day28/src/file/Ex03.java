package file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
	입출력 보조 스트림
	- 입출력을 좀 더 효율적으로 돕는 객체
	
	바이트 단위	: BufferedInputStream , BufferedOutputStream
	문자 단위		: BufferedReader, BufferedWirter
*/
public class Ex03 {
	public static void main(String[] args) throws IOException{		// throws하면 jvm(자바 가상머신)이 대신 처리
		BufferedReader fr = new BufferedReader(new FileReader("E:\\file test\\test1.txt"));
		BufferedReader br = new BufferedReader(fr);
//		1)		
//		char[] buf = new char[100];
//		
//		br.read(buf);
//		System.out.println(buf);

//		2)		
//		String line = br.readLine();	// 문자열 한줄만 출력함
//		System.out.println(line);
//		
//		line = br.readLine();
//		System.out.println(line);
//		
//		line = br.readLine();
//		System.out.println(line);
//		
//		line = br.readLine();
//		System.out.println(line);
		
		// readLine()은 문자의 마지막 줄에 도달하면 null을 반환
		// 이를 활용해서 문자 전체를 읽어올 수 있다
		String line;
		while((line =br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
}

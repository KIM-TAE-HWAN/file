package file;


import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException{
		// 파일 입력
		FileReader fr = new FileReader("E:\\file test\\test1.txt");
		char[] buf = new char[100]; // 글자수를 100개를 콘솔로 출력한다
		
		fr.read(buf);
		
		System.out.println(buf);
		System.out.println("파일 입력 완료");
		
		fr.close();
		
	}
}

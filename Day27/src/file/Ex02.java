package file;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("E:\\file test");
		
		// 해당 폴더가 없으면 생성
		if(!f1.exists()) {
		f1.mkdir();
		System.out.println("폴더 생성");
		}
		
		// E:\file test\test1.txt
		File f2 = new File(f1, "test1.txt");
		
		if(!f2.exists()) {
			f2.createNewFile();					// 파일생성시 중간 경로가 없으면 예외가 발생할 수 있다
												// 따라서, 파일 관련 메서드는 예외 전가가 많이 되는 편
			System.out.println("새 파일 생성");		// 입출력은 항상 프로그램이 기준     // 출력 : 쓰기 / 입력 : 읽기
		}
	}
}
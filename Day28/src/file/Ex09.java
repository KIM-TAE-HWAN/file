package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		// 실제 실행파일을 읽어서 복사
		File src = new File("E:\\file test\\jdk-8u381-windows-x64.exe");
		File dst = new File("E:\\file test\\copy.exe");
		
		// 1. 원본을 읽는다(=입력)
		FileInputStream fis = new FileInputStream(src);
		
		// 2. 대상에 쓴다(=출력)
		FileOutputStream fos = new FileOutputStream(dst);		// 하나씩 진행
		int data;
		
		while((data = fis.read()) != -1) {
			fos.write(data);
		}
		
		System.out.println("복사완료");
		// ※ 버퍼 없이 기계어로 복사하면 오래 걸린다
		
		fis.close();
		fos.close();
	}
}

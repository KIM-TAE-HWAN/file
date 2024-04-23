package service;

// import java.util.Random;
import java.util.UUID;

public class NewPw {
	
	// private Random ran = new Random();
	// private String aph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	public String getPw() {
		// System.out.println(aph.length());
		String result = "";
		
		result = UUID.randomUUID().toString().substring(0, 6);
		
		System.out.println("result : " + result);
		
		//for (int i = 0; i < 6; i++) {
		//	int idx = ran.nextInt(aph.length());
			
		//  System.out.println(idx);
		//	result += aph.charAt(idx);
		//}
		
		return result;
	}
}

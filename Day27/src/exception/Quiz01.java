package exception;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
	정수를 입력 받아서 출력하는 프로그램을 작성하시오
	
	단, 정수가 아닌 데이터가 입력되면 다시 입력 받을 수 있게 구성하세요
	
	※ 힌트 : buffer??
*/
public class Quiz01 {
	
	public static void main(String[] args) throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			try {
				System.out.println("정수 입력 :");
				n = sc.nextInt();
			
				System.out.println("\nn : " + n);
				break;
			} catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력해주세요\n");
				sc.nextLine();
			}	
		}
		sc.close();
	}
}


/*
import java.util.InputMismatchException;
import java.util.Scanner;


public class Quiz01 {
    static int input(Scanner sc) {
        int n ;
        
        try {
        System.out.print("정수 입력 : ");
        n = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("다시 입력 :");
            Scanner sc1 = new Scanner(System.in);
            n = input(sc1);
        }
        return n;
        
        }                

    
    public static void main(String[] args) throws InputMismatchException {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
            n = input(sc);

        System.out.println("\nn : " + n);
        
        sc.close();
    }
}
*/


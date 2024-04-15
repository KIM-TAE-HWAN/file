package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;



class Student {
	private static int count = 1000;
	private int idx;
	private String name;
	private int kor, eng, mat;
	
	// 새로 생성에 사용
	Student(String name, int kor, int eng, int mat) {
		this(kor, eng, mat, name);
		
		idx = count;
		count++;
	}
	
	// 수정에 사용
	Student(int kor, int eng, int mat, String name) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	int total() {
		return kor + eng + mat;
	}
	
	@Override
	public String toString() {
		String msg = "%d %s (합계 : %d)";
		msg = String.format(msg, idx, name, total());
		
		return msg;
	}
	
//	void detailInfo() {
//		System.out.println("학번 : " + idx);
//		System.out.println("이름 : " + name);
//		System.out.println("국어 : " + kor);
//		System.out.println("영어 : " + eng);
//		System.out.println("수학 : " + mat);
//		System.out.println("합계 : " + total());
//		System.out.println("평균 : " + total() / 3.0);
//	}
	
	void update(Scanner sc) {
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
	}
	
	int getIdx() {
		return idx;
	}

	public void load(String showStudents) {
		// TODO Auto-generated method stub
		
	}
}

class Controller {
	private Scanner sc = new Scanner(System.in);
	private LinkedList<Student> list = new LinkedList<>();
	private String showStudents;
	
	private void showMenu() {
		System.out.println("--학생 정보 관리 프로그램--");
		System.out.println("1. 학생 정보");
		System.out.println("2. 학생 정보 추가");
		System.out.println("3. 학생 정보 수정");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 저장");
		System.out.println("6. 불러오기");
		System.out.println("0. 종료\n");
		
		System.out.print(">>> ");
	}

	// 테스트용 더미 정보를 list에 채우는 코드 입니다
	private void test() {
		list.add(new Student("홍길동", 70, 80, 91));
		list.add(new Student("김민수", 90, 50, 71));
		list.add(new Student("박수진", 80, 60, 31));
		list.add(new Student("이진희", 60, 80, 91));
	}
	
	private void showStudents() {
		System.out.println("학생 목록)");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	private Student createStu() {
		String name;
		int kor, eng, mat;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		Student stu = new Student(name, kor, eng, mat);
		
		return stu;
	}
	
	private void addStudent() {
		list.add(createStu());
		System.out.println("추가 완료!!!");
	}
	
	private void search(int menu) {
		int idx;
		
		System.out.print("검색 학번 : ");
		idx = sc.nextInt();
		
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			
			if (idx == stu.getIdx()) {
				switch(menu) {
				case 3:		update(i, stu);	break;
				case 4:		delete(i);		break;
				}
				
				return;
			}
		}
		
		System.out.println("지정 학생은 존재하지 않습니다");
	}
	
	
	private void update(int i, Student stu) {
		stu.update(sc);
		
		list.set(i, stu);
		System.out.println("수정 완료~");
	}
	
	private void delete(int index) {
		list.remove(index);
		System.out.println("삭제 완료~");
	}
	
	private void save() throws IOException  {
		File file = new File(showStudents);
		Scanner sc = new Scanner(file);
		
		LinkedList<Student> users = new LinkedList<Student>();
		Student student;
		
		while (sc.hasNext()) {			
			student = new Student();			
			student.load(showStudents);				
			
			users.add(student);				
			System.out.println(student);
		}
		sc.close();
	}
	
	private void load() {
//		File dst = new File("1.txt");
//		
//		FileOutputStream fos = new FileOutputStream(dst);		// 하나씩 진행
//		int data;
//		
//		while((data = fis.read()) != -1) {
//			fos.write(data);
//		}
	}
	
//	private void sortRank() {
//		Comparator<Student> desc;
//		
//		desc = (Student o1, Student o2) -> {
//			return o2.total() - o1.total();
//		};
//		
//		list.sort(desc);
//		
//		System.out.println("정렬 완료");
//	}
	
	void run() throws IOException {
		test();
		int menu;
		
		do {
			showMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:		showStudents();	break;
			case 2:		addStudent();	break;
			case 3:		search(3);		break;
			case 4:		search(4);		break;
			case 5:		save();			break;
			case 6:		load();			break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴 입니다");
			}
			
			System.out.println();
			
		} while(menu != 0);
		
		sc.close();
	}
}


public class Quiz01 {
	public static void main(String[] args) throws IOException {
		// 학생 관리 프로그램을 작성
		// 1. 학생 목록 -> 이름 국 영 수 합계를 출력
		// 2. 학생 정보 추가
		// 3. 학생 정보 수정
		// 4. 학생 정보 삭제
		// 5. 저장
		// 6. 불러오기
		// 0. 종료
		
		new Controller().run();
	}
}

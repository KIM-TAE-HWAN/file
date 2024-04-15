package quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



class Member {
	String id , pw , name;

	public Member(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Seller extends Member{
	private String store;
	
	public Seller(String id, String pw, String name, String store) {
		super(id, pw, name);
		this.store = store;
	}
	
	public String getStore() {
		return store;
	}
	
	public void setStore(String store) {
		this.store = store;
	}
	
	@Override
	public String toString() {
		return String.format("(판매자 정보)\n id : %s\n pw : %s\n 이름 : %s\n 가게이름 : %s"
			,getId(), getPw(), getName(), getStore());
	}
}

class Customer extends Member {
	private String address;
	public Customer(String id, String pw, String name, String address) {
		super(id, pw, name);
		this.address = address; 
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format("(구매자 정보)\n id : %s\n pw : %s\n 이름 : %s\n 주소 : %s"
			,getId(), getPw(), getName(), getAddress());
	}
}

class Controller {
	
	ArrayList<Member> list = new ArrayList<Member>();
	
	public int insert(Member member) {
		for(Member m : list) {
			if(m.getId().equals(member.getId())) {
				return 0;
			}
		}
		list.add(member);
		return 1;
	}
	
	public ArrayList<Member> select() {
		ArrayList<Member> list = this.list;
		return list;
	}
	
	public int delete(String id) {
		boolean delete = list.removeIf(member -> member.getId().equals(id));
		return delete ? 1:0;
	}
	
	public Member search(String id) {
		Member member = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				member = list.get(i);
				break;
			}
		}
		return member;
	}				
}

public class Main {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu, type, row;
		String id, pw, name, store, address;
		Controller controller = new Controller();
		Member member = null;
		ArrayList<Member> list = null;
		
		while(true) {
			System.out.println("1. 회원가입"); 
			System.out.println("2. 회원탈퇴"); 
			System.out.println("3. 전체목록"); 
			System.out.println("4. 단일검색"); 
			System.out.println("5. 정렬");
			System.out.println("0. 종료");
			
			System.out.println(">>> ");
			
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 :
				System.out.println("회원가입");
				System.out.println("회원 유형을 선택하세요 (1. 구매자 / 2. 판매자) : ");
				type = Integer.parseInt(sc.nextLine());
				System.out.println("id를 입력하세요 :");
				id = sc.nextLine();
				System.out.println("pw를 입력하세요 :");
				pw = sc.nextLine();
				System.out.println("이름을 입력하세요 :");
				name = sc.nextLine();
				
				if(type == 1) {
					System.out.println("배송 주소를 입력하세요 :");
					address = sc.nextLine();
					member = new Customer(id, pw, name, address);
				}
				else if(type == 2) {
					System.out.println("가게 이름을 입력하세요 : ");
					store = sc.nextLine();
					member = new Seller(id, pw, name, store);
				}
				
				row = controller.insert(member);
				if(row == 1) {
					System.out.println("회원가입이 정상적으로 처리되었습니다");
				}
				else if(row == 0) {
					System.out.println("이미 등록된 아이디입니다");			
				}
				else {
					System.out.println("회원가입 안됨");
				}
				break;
				
			case 2:
				System.out.println("지정한 계정을 탈퇴합니다\n");
				System.out.println("id로 회원을 검색합니다\n");
				System.out.println("검색할 id 입력 : ");
				id = sc.nextLine();			
				break;
				
			case 3:
				System.out.println("전체 회원 정보");
				list = controller.select();
				list.forEach(m -> System.out.println(m));
				break;
	
			case 4:
				System.out.println("id로 회원을 검색합니다");
				System.out.println("검색할 id입력 :");
				id = sc.nextLine();
				
				Member mb = controller.search(id);
				if(mb != null) {
					System.out.println("검색결과 : ");
					System.out.println(mb);
				}
				else {
					System.out.printf("%s : 회원을 찾을 수 없습니다\n", id);
				}
				break;
			
			case 5:
				Comparator<Member> desc;
					
				desc = (Member o1, Member o2) -> {
						return o2.id() - o1.id();
				};
					
				list.sort(desc);
					
				System.out.println("정렬 완료");			
				
			case 0:
				System.out.println("프로그램 종료");
				
				sc.close();
				return;
				
			}
			
		}
	}
}



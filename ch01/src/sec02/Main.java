package sec02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Member m =new Member("1","홍길동",18);
			System.out.println(m);
			System.out.println(m.getId());
			m.setName("일지매");
			System.out.println(m.getName());
			
		}catch(Exception e) {
			
		}
	}

}

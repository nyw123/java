package sec03;

public class ErrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value = Integer.parseInt("1oo");
		}catch(Exception e) {
			System.err.println("에러내용"); // 빨간글씨
			System.err.println(e.getMessage());
		}
	}

}

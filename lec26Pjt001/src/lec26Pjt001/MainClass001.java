package lec26Pjt001;

public class MainClass001 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("BEFORE Ecexption");
		
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace(); // 어떠한 예외발생인지 출력
			String msg = e.getMessage(); // 예외를 간략하게 보여줌
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Ecexption AFTER");
		
	}
	
}

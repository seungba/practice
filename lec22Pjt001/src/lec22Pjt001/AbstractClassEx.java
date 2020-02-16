package lec22Pjt001;

public abstract class AbstractClassEx {

	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() {
		System.out.println(" -- fun1() START -- ");
	}
	
	public abstract void fun2();
	// 추상클래스에서는 기존의 클래스 기능 +
	// 정의부가 구현되지 않은 메서드 사용 가능
}

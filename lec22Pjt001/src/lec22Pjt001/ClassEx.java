package lec22Pjt001;

public class ClassEx extends AbstractClassEx {

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s); // 상위객체 상속을 해주고 있는 객체
	}
	
	@Override
	public void fun2() { // 반드시 정의부 구현하여야 한다
		System.out.println(" -- fun2() START -- ");
	}

}

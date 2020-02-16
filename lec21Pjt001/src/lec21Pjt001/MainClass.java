package lec21Pjt001;

public class MainClass {

	public static void main(String[] args) {
		
		InterfaceA ia = new ImplementClass();
		InterfaceB ib = new ImplementClass();
		InterfaceC ic = new ImplementClass();
		InterfaceD id = new ImplementClass();
		
		ImplementClass iaa = new ImplementClass();
		
		System.out.println();
		
		ia.funA();
		ib.funB();
		ic.funC();
		id.funD();
		
		System.out.println();
		
		iaa.funA();
		iaa.funB();
		iaa.funC();
		iaa.funD();
		
		// 인터페이스란?
		// 클래스와 달리 객체를 생성할 수 없으며,
		// 클래스에서 구현하여야 하는 작업명세서
	}
	
}
 
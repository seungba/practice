package lec14Pjt001;

public class MainClass {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println();
		
		System.out.println("obj1 ----> " + obj1);
		System.out.println("obj2 ----> " + obj2);
		System.out.println("obj3 ----> " + obj3);
		
		System.out.println();
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3) {
			System.out.println("obj2 == obj3");
		} else {
			System.out.println("obj2 != obj3");
		}
		
		if(obj1 == obj3) {
			System.out.println("obj1 == obj3");
		} else {
			System.out.println("obj1 != obj3");
		}
		
		System.out.println();
		
		System.out.println("obj1 ----> " + obj1);
		obj1.getInfo();
		
		
		// 레퍼런스에 NULL이 저장되면
		// 객체의 연결이 끊기며,
		// 더이상 객체를 이용할 수 없다.
		obj1 = null;
		System.out.println("obj1 ----> " + obj1);
		obj1.getInfo(); // NullPointerException
		
	}
	
}

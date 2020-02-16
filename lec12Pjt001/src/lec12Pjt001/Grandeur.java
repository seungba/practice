package lec12Pjt001;


// 클래스는 멤버 변수(속성), 메서드(기능), 생성자 등으로 구성된다.

public class Grandeur { // 클래스 이름 : 일반적으로 첫글자는 대문자로 한다.

	public String color;
	public String gear; // 멤버변수 (속성)
	public int price;
	
	public Grandeur() {
		// 생성자 (가장먼저 호출되는부분)
		// 메모리에 객체가 올라간다
		// 클래스 이름과 동일
		// 반환형이 없음
		// 생성을 할 떄 필요한 내용을 기술 (없을경우 빈공간으로)
		System.out.println("Grandeur constructor");
	}
	
	public void run() { // 메서드 (기능)
		System.out.println("-- run --");
	}
	
	public void stop() { // 메서드 (기능)
		System.out.println("-- stop --");
	}
	
	public void info() {
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
	
}

package lec09Pjt001;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// 양자택일 IF // 다자택일 switch

		int num1 = 10;
		int num2 = 20;

		// if(조건식)
		if (num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
		}

		System.out.println();

		// if(조건식) else
		if (num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
		} else {
			System.out.println("num1은 num2보다 크거나 같다.");
		}

		System.out.println();

		// if(조건식) else if(조건식)
		if (num1 < num2) {
			System.out.println("num1은 num2보다 작다.");
		} else if (num1 > num2) {
			System.out.println("num1은 num2보다 크다.");
		} else if (num1 == num2) {
			System.out.println("num1은 num2같다.");
		} else {
			System.out.println("num 1은 num2와 크지도 작지도 같지도 않다.");
		}

		if (true) {
			System.out.println("===================");
		}

		System.out.println();

		// switch문
		System.out.print("점수를 입력하세요. : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();

		switch (score) {
		case 100:
		case 90:
			System.out.println("수");
			break;

		case 80:
			System.out.println("우");
			break;

		case 70:
			System.out.println("미");
			break;

		default:
			System.out.println("try again!!");
			break;
		}

		inputNum.close();

//		System.out.println("점수를 입력하세요. : ");
//		Scanner inputNum = new Scanner(System.in);
//		int score = inputNum.nextInt();
//		
//		
//		switch(score) {
//		case 100:
//		case 90:
//			System.out.println("수");
//			break;
//		case 80:
//			System.out.println("우");
//			break;
//		case 70:
//			System.out.println("미");
//			break;
//		case 60:
//			System.out.println("양");
//			break;
//		case 50:
//			System.out.println("가");
//			break;
//		}
//		
//		inputNum.close();

	}
}

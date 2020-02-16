package lec26Pjt001;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass002 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i, j;
		ArrayList<String> list = null;

		int[] iArr = { 0, 1, 2, 3, 4 };

		System.out.println("Ecexption BEFORE");

		try {

			System.out.println("input i : ");
			i = scanner.nextInt();
			System.out.println("input j : ");
			j = scanner.nextInt();

			System.out.println("i / j = " + (i / j));

			for (int k = 0; k < 6; k++) {
				System.out.println("iArr[" + k + "] : " + iArr[k]);
			}

			System.out.println("list.size() : " + list.size());

		} catch (InputMismatchException e) { // 정수 입력자리에 문자입력
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) { // 배열 범위를 벗어남
			e.printStackTrace();
		} catch (Exception e) { // Exception 이 최상위 클래스
			e.printStackTrace();
		}

		
		//예외처리가 끝나면 이곳으로 온다
		System.out.println("Ecexption AFTER");

	}

}

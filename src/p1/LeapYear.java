package p1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		int year = scanner.nextInt();

		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("윤년");
			return;
		}
		System.out.println("평년");
	}

}

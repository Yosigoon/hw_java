package p1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ��� : ");
		int year = scanner.nextInt();

		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("����");
			return;
		}
		System.out.println("���");
	}

}

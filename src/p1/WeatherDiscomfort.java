package p1;

import java.util.Scanner;

public class WeatherDiscomfort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Ǳ� �µ� �Է�");
		double dry = scanner.nextDouble();

		System.out.println("����  �µ� �Է�");
		double wet = scanner.nextDouble();

		double index = 0.72 * (dry + wet) + 40.6;
		System.out.println("�������� "+index);

		/*
		 * double a= 0.72*(27.9+22.1)+40.6; System.out.println(a);
		 */

	}

}

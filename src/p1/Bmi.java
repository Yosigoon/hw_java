package p1;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("성별을 입력하세요. 남 or 여 ");

		String gender = scanner.next();

		int a = 0;
		if (gender.equals("여")) {
			System.out.println("여자면 기준을 바꿔야지~");
			a = a + 5;
		}

		System.out.println("키를 입력하세요. ex: x.xx m : ");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요.  kg :");
		double weight = scanner.nextDouble();

		double bmi = weight / Math.pow(height, 2);

		System.out.println(bmi);

		if (bmi > 35 - a) {
			System.out.println("고도 비만");
		} else if (bmi >= 30 - a) {
			System.out.println("중등도 비만");
		} else if (bmi >= 25 - a) {
			System.out.println("경도 비만");
		} else if (bmi >= 23 - a) {
			System.out.println("과체중");
		} else if (bmi >= 18.5 - a) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}

	}

}

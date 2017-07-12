package p1;

import java.util.Scanner;

public class Donut {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("큰원의 반지름을 입력하세요 : ");
		double r1 = scanner.nextInt();

		System.out.println("작은원의 반지름을 입력하세요 : ");
		double r2 = scanner.nextInt();

		double area1 = Math.PI * Math.pow(r1, 2); // 큰원의 넓이
		double area2 = Math.PI * Math.pow(r2, 2); // 작은원의 넓이

		double result = (area1 - area2);

		System.out.println("도넛의 넓이는  : ");
		System.out.println(result < 0 ? result * -1 : result);

	}

}


package p1;

import java.util.Scanner;

public class Donut {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("ū���� �������� �Է��ϼ��� : ");
		double r1 = scanner.nextInt();

		System.out.println("�������� �������� �Է��ϼ��� : ");
		double r2 = scanner.nextInt();

		double area1 = Math.PI * Math.pow(r1, 2); // ū���� ����
		double area2 = Math.PI * Math.pow(r2, 2); // �������� ����

		double result = (area1 - area2);

		System.out.println("������ ���̴�  : ");
		System.out.println(result < 0 ? result * -1 : result);

	}

}


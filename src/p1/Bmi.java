package p1;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. �� or �� ");

		String gender = scanner.next();

		int a = 0;
		if (gender.equals("��")) {
			System.out.println("���ڸ� ������ �ٲ����~");
			a = a + 5;
		}

		System.out.println("Ű�� �Է��ϼ���. ex: x.xx m : ");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���.  kg :");
		double weight = scanner.nextDouble();

		double bmi = weight / Math.pow(height, 2);

		System.out.println(bmi);

		if (bmi > 35 - a) {
			System.out.println("�� ��");
		} else if (bmi >= 30 - a) {
			System.out.println("�ߵ ��");
		} else if (bmi >= 25 - a) {
			System.out.println("�浵 ��");
		} else if (bmi >= 23 - a) {
			System.out.println("��ü��");
		} else if (bmi >= 18.5 - a) {
			System.out.println("����ü��");
		} else {
			System.out.println("��ü��");
		}

	}

}

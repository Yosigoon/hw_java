package p1;

import java.util.Scanner;

public class AnswerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int current = 100 >> 1;
//		System.out.println("���� ���� " + current);
		int idx = 1;
		
		outer:
		for (;;) {
			System.out.println("�����ϴ� ���ڰ� " + current + "���� �? (h or l or c)");
			String answer = sc.next();
			switch (answer) {
			case "h":
//				current =
				break;
			case "l":
//				current =
				break;
			case "c":
				return;
			}

		}

	}

}

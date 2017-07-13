package p1;

import java.util.Scanner;

public class AnswerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 100;
		int current = max >> 1;
//		System.out.println("현재 값은 " + current);
		
		
		
		for (;;) {
			System.out.println("생각하는 숫자가 " + current + "보다 어때? (h or l or c)");
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

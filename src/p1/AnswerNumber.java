package p1;

import java.util.Scanner;

public class AnswerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int max = 100;
		int current = max >> 1;
		max = max >> 1;
		
		
		for (;;) {
			System.out.println("생각하는 숫자가 " + current + "보다 어때? (h or l or c)");
			String answer = sc.next();
			
			max = max >> 1;
			switch (max) {
			case 0:
				max = 1;
				break;

			default:
				break;
			}
			
			switch (answer) {
			case "h":
				current += max; 
				break;
			case "l":
				current -= max;
				break;
			case "c":
				return;
			}

		}

	}

}

package array;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = new String[4];

		int idx = (int) (Math.random() * 4);

		arr[idx] = "o";

		for (String str : arr) {
			System.out.println("Enter눌러");
			sc.nextLine();
			System.out.println(str);

			if (str != null && str.equals("o")) {
				System.out.println("재수없는날이다..");
				break;
			}
			System.out.println("요리조리 잘 빠져나가네~");
		}
	}
}

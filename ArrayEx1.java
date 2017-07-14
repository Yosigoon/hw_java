package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾고 싶은 숫자는? : ");
//		int answer = sc.nextInt();
			
		int[][] arr = new int[100][];

		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {

			arr[i] = new int[i + 1];

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++count;
				
//				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}

// int[] arr = new int[4];
//
// int[] arr2 = arr;
//
// System.out.println(arr);
// System.out.println(arr2);
//
// System.out.println(Arrays.toString(arr));
// System.out.println(arr==arr2);

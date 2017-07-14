package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lotto1 {

	public static void main(String[] args) {

		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (array[i]==array[j]) {
					i--;
					break;
				}
//				System.out.println(Arrays.toString(array));
			}

		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}

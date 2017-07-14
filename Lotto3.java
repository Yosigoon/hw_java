package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lotto3 {
	
	
	public static void main(String[] args) {
		System.out.println("¹öÀü 3");

		int lotto[] = IntStream.range(1, 46).toArray();
		
		for (int i = 0; i < 6; i++) {
			
			int pos = (int) (Math.random() * (45-i) + 1);
//			System.out.println(pos);
			int temp = lotto[pos-1];
			lotto[pos-1] = lotto[44-i];
			lotto[44-i] = temp;
			
//			System.out.println(Arrays.toString(lotto));
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[lotto.length-1-i] + " ");	
		}
		
		
		

	}
}

// System.out.println(Arrays.toString(lotto));
//
// for (int i = 1; i < lotto; i++) {
// lotto[i] = (int)(Math.random() * 45 + 1);
// System.out.println(Arrays.toString(lotto));
//

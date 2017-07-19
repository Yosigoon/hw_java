package oop3;

import java.util.Arrays;

public class SliceTest {

	public static void main(String[] args) {
		
		String[] arr = {"One", "Two", "Three", "Four", "Five"};

		String[] arr2 = Arrays.copyOfRange(arr, 2, arr.length);
		
		System.out.println(Arrays.toString(arr2));
	}
}

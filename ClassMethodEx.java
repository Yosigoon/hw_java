package oop1;

import java.util.Arrays;

public class ClassMethodEx {
	
	public static int[] reduce(int[] arr) {
		
		int[] temp = new int[arr.length -1];
		
		System.arraycopy(arr, 0, temp, 0, temp.length);
		
		return temp;
	}

	public static int doA(int[] arr) {
		System.out.println(Arrays.toString(arr));
	
		if(arr.length == 0) {
			return 0;
		}
		
		return arr[arr.length -1] + doA(reduce(arr)) ;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(ClassMethodEx.doA(arr));
	}
}

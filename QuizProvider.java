package oop3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class QuizProvider {
	
	Scanner fileScanner;
	
	Quiz[] arr;
	
	int idx;
	
	public QuizProvider() throws Exception{
		
		idx = 0; 
		
		File file = new File("C:\\zzz\\sample.txt");
		fileScanner = new Scanner(file);
		arr = new Quiz[10];
		for (int i = 0; i < arr.length; i++) {
			//�� ������ �д´�. 
			String line = fileScanner.nextLine();
			//Quiz�ν��Ͻ��� �����. 
			String[] lineArr = line.split(",");
			//System.out.println(Arrays.toString(lineArr));
			
			Quiz quiz = new Quiz(lineArr[0], 
					lineArr[1], 
					Arrays.copyOfRange(lineArr, 2, lineArr.length));
			
			//System.out.println(quiz);
			
			//arr�� ��´�. 
			arr[i] = quiz;
		}
	}
	

	public Quiz getNextQuiz() {
		
		if(idx == arr.length -1) {
			return null;
		}
		
		return arr[idx++];
	}
}



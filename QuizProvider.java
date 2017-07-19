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
			//한 라인을 읽는다. 
			String line = fileScanner.nextLine();
			//Quiz인스턴스를 만든다. 
			String[] lineArr = line.split(",");
			//System.out.println(Arrays.toString(lineArr));
			
			Quiz quiz = new Quiz(lineArr[0], 
					lineArr[1], 
					Arrays.copyOfRange(lineArr, 2, lineArr.length));
			
			//System.out.println(quiz);
			
			//arr에 담는다. 
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



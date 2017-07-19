package oop3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TempMain {

	public static void main(String[] args) throws Exception{
		
		//재료 
		Scanner fileScanner;
		Scanner keyScanner;
		Quiz[] arr;
		
		//재료의 초기화 
		File file = new File("C:\\zzz\\sample.txt");
		fileScanner = new Scanner(file);
		keyScanner = new Scanner(System.in);
		
		arr = new Quiz[10];
			//문제 로딩
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
		
		//welcome
		System.out.println("welcome");
		//문제 풀기 
		for (Quiz quiz : arr) {
			
			System.out.println(quiz.getTitle());
			System.out.println(Arrays.toString(quiz.getOptions()));
			
			System.out.println("정답은???");
			String userAnswer = keyScanner.nextLine();
			
			if(quiz.checkAnswer(userAnswer) == false) {
				System.out.println("틀렸습니다. 다음 기회에...");
				break;
			}
			
		}
		
		
		
		
	}
}

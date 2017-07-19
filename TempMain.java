package oop3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TempMain {

	public static void main(String[] args) throws Exception{
		
		//��� 
		Scanner fileScanner;
		Scanner keyScanner;
		Quiz[] arr;
		
		//����� �ʱ�ȭ 
		File file = new File("C:\\zzz\\sample.txt");
		fileScanner = new Scanner(file);
		keyScanner = new Scanner(System.in);
		
		arr = new Quiz[10];
			//���� �ε�
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
		
		//welcome
		System.out.println("welcome");
		//���� Ǯ�� 
		for (Quiz quiz : arr) {
			
			System.out.println(quiz.getTitle());
			System.out.println(Arrays.toString(quiz.getOptions()));
			
			System.out.println("������???");
			String userAnswer = keyScanner.nextLine();
			
			if(quiz.checkAnswer(userAnswer) == false) {
				System.out.println("Ʋ�Ƚ��ϴ�. ���� ��ȸ��...");
				break;
			}
			
		}
		
		
		
		
	}
}

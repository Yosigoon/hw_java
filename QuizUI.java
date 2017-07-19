package oop3;

import java.util.Arrays;
import java.util.Scanner;

public class QuizUI {

	Scanner keyScanner;
	QuizProvider provider;

	public QuizUI(QuizProvider provider) {
		keyScanner = new Scanner(System.in);
		this.provider = provider;
	}

	public void welcome() {

		System.out.println("welcome");

	}

	public void participate() {
		// ���� Ǯ��
		Quiz quiz = provider.getNextQuiz();
		
		if(quiz == null) {
			System.out.println("Winner of Quiz!!! �߳���");
			return;
		}
		
		System.out.println(quiz.getTitle());
		System.out.println(Arrays.toString(quiz.getOptions()));

		System.out.println("������???");
		String userAnswer = keyScanner.nextLine();

		if (quiz.checkAnswer(userAnswer) == false) {
			System.out.println("Ʋ�Ƚ��ϴ�. ���� ��ȸ��...");
			return;
		}
		
		participate();

	}

}

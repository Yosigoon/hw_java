package interface2;

import java.util.Scanner;

public class QuizMachine {

	IQuiz[] arr;
	int idx;
	Scanner scanner;
	
	public QuizMachine(IQuiz[] arr) {
		this.arr = arr;
		this.idx = 0;
		this.scanner = new Scanner(System.in);
	}
	
	public void playQuizShow() {
		
		IQuiz quiz = arr[idx];
		
		System.out.println(quiz.getTitle());
		System.out.println(quiz.getOptions());
		
		String userAnswer = scanner.nextLine();
		
		boolean result = quiz.checkAnswer(userAnswer);
		
		if(result == false) {
			return;
		}
		
		idx++;
		playQuizShow();
	}
	
	
	
	
}

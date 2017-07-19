package oop3;

import java.util.Arrays;

public class Quiz {

	String title;
	String answer;
	String[] options;
	
	public Quiz(String title, String answer, String...options) {
		this.title = title;
		this.answer = answer;
		this.options = options;
	}
		
	public String getTitle() {
		return title;
	}

	public String[] getOptions() {
		return options;
	}

	@Override
	public String toString() {
		return "Quiz [title=" + title + ", answer=" + answer + ", options=" + Arrays.toString(options) + "]";
	}

	public boolean checkAnswer(String userAnswer) {
		// TODO Auto-generated method stub
		return this.answer.equals(userAnswer);
	}
	
	
	
	
	
}

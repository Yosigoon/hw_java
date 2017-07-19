package oop3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		QuizProvider provider = new QuizProvider();
		QuizUI ui = new QuizUI(provider);
		ui.welcome();
		ui.participate();
		
	}
}

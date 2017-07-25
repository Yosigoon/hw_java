package interface2;

public interface IQuiz {

	public String getTitle();
	
	public String getOptions();
	
	public boolean checkAnswer(String userAnswer);
}

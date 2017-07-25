package interface2;

public class SubQuiz extends AbstractQuiz {

	String answer;

	@Override
	public String getOptions() {
		return "";
	}

	@Override
	public boolean checkAnswer(String userAnswer) {
		return answer.equals(userAnswer);
	}
}

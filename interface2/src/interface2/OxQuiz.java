package interface2;

public class OxQuiz extends AbstractQuiz{

	char answer;

	@Override
	public String getOptions() {
		// TODO Auto-generated method stub
		return "O or X";
	}

	@Override
	public boolean checkAnswer(String userAnswer) {

		return answer == userAnswer.charAt(0);
	}
}

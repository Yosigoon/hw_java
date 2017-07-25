package interface2;

import java.util.Arrays;

public class MultiQuiz extends AbstractQuiz{

	int answer;
	String[] options;
	
	@Override
	public String getOptions() {
		
		return Arrays.toString(options);
	}
	@Override
	public boolean checkAnswer(String userAnswer) {

		return answer == Integer.parseInt(userAnswer);
	
	}
	
	
	
	
}

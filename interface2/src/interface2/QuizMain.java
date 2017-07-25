package interface2;

/**
 * 인터페이스 테스트 클래스
 * @author hw
 *
 */

public class QuizMain {

	public static void main(String[] args) {
		
		OxQuiz quiz1 = new OxQuiz();
		quiz1.title ="서울은 대한민국의 수도다";
		quiz1.answer ='o';
		
		IQuiz[] arr = {
			quiz1
		};
		
		QuizMachine machine = new QuizMachine(arr);
		machine.playQuizShow();
		
	}
}

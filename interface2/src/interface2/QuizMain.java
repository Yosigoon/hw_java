package interface2;

/**
 * �������̽� �׽�Ʈ Ŭ����
 * @author hw
 *
 */

public class QuizMain {

	public static void main(String[] args) {
		
		OxQuiz quiz1 = new OxQuiz();
		quiz1.title ="������ ���ѹα��� ������";
		quiz1.answer ='o';
		
		IQuiz[] arr = {
			quiz1
		};
		
		QuizMachine machine = new QuizMachine(arr);
		machine.playQuizShow();
		
	}
}

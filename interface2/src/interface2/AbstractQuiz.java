package interface2;

public abstract class AbstractQuiz implements IQuiz{

	String title;

	public AbstractQuiz() {
		super();
	}

	@Override
	public String getTitle() {
		return this.title;
	}
	
	

}
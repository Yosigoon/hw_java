package oop1;

public class TrainCalculatorUI {

	TrainCalculator calculator;
	
	public TrainCalculatorUI(TrainCalculator calculator) {
		super();
		this.calculator = calculator;
	}



	public void calculate() {
		System.out.println("������ �޷����ô�.");
		
		Train atrain = new Train("A", 100, 130 );
		Train btrain = new Train("B", 0, 240 );
		
		
		int min = calculator.calcMin(atrain, btrain);
		
		System.out.printf("%d �� �Ŀ� �߿� \n", min);
		
		System.out.println(btrain);
		System.out.println(atrain);
		
	}
}











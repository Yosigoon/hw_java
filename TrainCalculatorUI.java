package oop1;

public class TrainCalculatorUI {

	TrainCalculator calculator;
	
	public TrainCalculatorUI(TrainCalculator calculator) {
		super();
		this.calculator = calculator;
	}



	public void calculate() {
		System.out.println("기차를 달려봅시다.");
		
		Train atrain = new Train("A", 100, 130 );
		Train btrain = new Train("B", 0, 240 );
		
		
		int min = calculator.calcMin(atrain, btrain);
		
		System.out.printf("%d 분 후에 추월 \n", min);
		
		System.out.println(btrain);
		System.out.println(atrain);
		
	}
}











package oop1;

public class Main {

	public static void main(String[] args) {

		TrainCalculator calculator = new TrainCalculator();
		
		TrainCalculatorUI ui = new TrainCalculatorUI(calculator);
		
		ui.calculate();
		
//		PiggySave save = new PiggySave();
//		
//		PiggySaveUI ui = new PiggySaveUI(save);
//		
//		ui.init();
		
	}
}

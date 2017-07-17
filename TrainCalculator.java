package oop1;

public class TrainCalculator {

	public int calcMin(Train a, Train b) {
		
		int minCount = 0; 
		while(true) {
			minCount++;
			double apos = a.runMin();
			double bpos = b.runMin();
			
			if(bpos >= apos) {
				break;
			}
		}
		
		return minCount;
	}
	
}

package oop1;

public class PiggySave {

	int total;
	
	public PiggySave() {
		total = 0;
	}
	
	public void deposit(int money) {
		total += money;
	}
	
	public int withdraw() {
		int result = total;
		total = 0;
		return result;
	}
	
}

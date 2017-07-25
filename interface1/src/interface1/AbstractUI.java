package interface1;

import java.util.Scanner;

public abstract class AbstractUI implements IMakeShape {

	protected Scanner scanner;
	
	public AbstractUI() {
		scanner = new Scanner(System.in);
	}
	
	public int getInt(String msg) {
		System.out.println(msg);
		return Integer.parseInt(scanner.nextLine());
	}
	public double getDouble(String msg) {
		System.out.println(msg);
		return Double.parseDouble(scanner.nextLine());
	}	
}

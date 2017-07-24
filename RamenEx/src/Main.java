import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		RamenContainer rc = new RamenContainer();
		RamenUI ui = new RamenUI(rc);

		rc.ramenArr();
		ui.bending(s);

		// Ramen[] arr = new Ramen[15];
		// public Ramen[] container() {
		//
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = new Ramen();
		// }
		//
		// return arr;
	}

}
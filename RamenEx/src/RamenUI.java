import java.util.Arrays;
import java.util.Scanner;

public class RamenUI {

	RamenContainer rc;
	Ramen[] arr;
	Scanner s = new Scanner(System.in);

	public RamenUI(RamenContainer rc) {
		this.rc = rc;
	}

	public void bending(Scanner s) {
		arr = rc.ramenArr();
		while (true) {
			System.out.println("===============");
			System.out.println("라면을 뽑으려면 엔터");
			int answer = Integer.parseInt(s.nextLine());
			rc.getNext(answer);
//			Ramen taget = arr[answer];
//			taget.cook();

		}

	}
}
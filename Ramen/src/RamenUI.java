import java.util.Scanner;

public class RamenUI {

	RamenContainer container;

	public RamenUI(RamenContainer container) {
		super();
		this.container = container;
	}

	Scanner scanner = new Scanner(System.in);

	public void bending() {
		while (true) {

			System.out.println("�������� ? ");
//			int choice = scanner.nextInt();
			container.getNext();

		}

	}

}
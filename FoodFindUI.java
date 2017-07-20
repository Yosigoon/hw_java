package food;

import java.util.Arrays;
import java.util.Scanner;

public class FoodFindUI {

	FoodFinder finder;

	public FoodFindUI(FoodFinder finder) {
		this.finder = finder;
	}

	public void searchUI() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ã�ڽ��ϴ�");

		System.out.println("���������� �Է��ϼ���.");
		int low = Integer.parseInt(scanner.nextLine());

		System.out.println("�ְ����� �Է��ϼ���.");
		int high = Integer.parseInt(scanner.nextLine());

		SearchCri cri = new SearchCri(low, high);

		FoodVO[] result = finder.search(cri);

		System.out.println(Arrays.toString(result));

	}

}

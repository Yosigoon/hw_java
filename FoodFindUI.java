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
		System.out.println("음식을 찾겠습니다");

		System.out.println("최저가격을 입력하세요.");
		int low = Integer.parseInt(scanner.nextLine());

		System.out.println("최고가격을 입력하세요.");
		int high = Integer.parseInt(scanner.nextLine());

		SearchCri cri = new SearchCri(low, high);

		FoodVO[] result = finder.search(cri);

		System.out.println(Arrays.toString(result));

	}

}

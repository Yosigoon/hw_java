package food;

import java.util.Arrays;

public class FoodFinder {

	// ���� �䱸 ���� - �����Ͻ� �䱸 ���� // ����̸��� ���� ���ϴ� ..Ư���� ���ĵ�

	FoodVO[] foods;

	public FoodFinder(FoodVO[] arr) { // ������
		foods = arr;
	}

	public FoodVO[] search(SearchCri cri) { // ����ã���ִ� ��Ȱ
		// System.out.println("debug .... seach ");

		FoodVO[] resultArr = (FoodVO[]) Arrays.stream(foods).filter(x -> x.accept(cri)).toArray(FoodVO[]::new);
		return resultArr;
	}

	// ���� ����� ��� �Ǵ� ����پ� ������ ���� �����ϸ� Ȯ�强������
	// ���ư��°� �߿�

}

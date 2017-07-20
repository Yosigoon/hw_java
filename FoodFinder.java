package food;

import java.util.Arrays;

public class FoodFinder {

	// 고객의 요구 사항 - 비지니스 요구 사항 // 기능이먼저 고객이 원하는 ..특정한 음식들

	FoodVO[] foods;

	public FoodFinder(FoodVO[] arr) { // 생성자
		foods = arr;
	}

	public FoodVO[] search(SearchCri cri) { // 음식찾아주는 역활
		// System.out.println("debug .... seach ");

		FoodVO[] resultArr = (FoodVO[]) Arrays.stream(foods).filter(x -> x.accept(cri)).toArray(FoodVO[]::new);
		return resultArr;
	}

	// 내가 만드는 방법 또는 방법다양 기준은 없다 가능하면 확장성유지성
	// 돌아가는게 중요

}

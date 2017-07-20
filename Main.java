package food;

public class Main {
	
	public static void main(String[] args) {

    FoodVO[] arr = new FoodVO[10];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = new FoodVO("À½½Ä" + i, i * 1000);

    }

    FoodFinder finder = new FoodFinder(arr);
    FoodFindUI ui = new FoodFindUI(finder);
    ui.searchUI();
	}
}


public class RamenContainer {

	Ramen ramen;
	Ramen[] arr;
	int idx = 0;

	public Ramen[] ramenArr() {
		arr = new Ramen[15];
		for (int i = 0; i < arr.length; i++) {

			if (i >= 10) {
				arr[i] = new ZRamen();
				continue;
			}
			if (i >= 5) {
				arr[i] = new BRamen();
				continue;
			}
			arr[i] = new Ramen();
		}
		return arr;
	}

	public Ramen getNext(int num) {

		Ramen result = arr[num];

		arr[num] = null;

		result.cook();

		return result;

	}
}

public class RamenContainer {

	Ramen[] arr;
	int idx;

	public RamenContainer(Ramen[] arr) {
		super();
		this.arr = arr;
		this.idx = 0;

	}

	public Ramen getNext() {

		int index = idx;
		
		Ramen result = arr[index];

		arr[idx] = null;

		idx++;

		result.cook();
		
		return result;

	}

}
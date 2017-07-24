public class Main {

	public static void main(String[] args) {

		Ramen[] arr = new Ramen[20];

		for (int i = 0; i < arr.length; i++) {

			if (i>=15) {
				arr[i] = new MRamen();
				continue;
			}
			
			if (i >= 10) {
				arr[i] = new BRamen();
				continue;
			}

			if (i >= 5) {
				arr[i] = new ZRamen();
				continue;
			}
			arr[i] = new Ramen();
		}

		RamenContainer container = new RamenContainer(arr);

		RamenUI ui = new RamenUI(container);
		ui.bending();
	}
}

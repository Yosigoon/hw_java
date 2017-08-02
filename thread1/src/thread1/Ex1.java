package thread1;

public class Ex1 {

	public void doA() {

		new Thread(() -> {

			for (int i = 0; i < 1000; i++) {
				System.out.println(i);

			}

		}).start();

	}

	public static void main(String[] args) {

		Ex1 obj = new Ex1();
		obj.doA();
		obj.doA();

	}

}

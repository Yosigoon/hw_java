package thread1;

public class Car extends Thread {

	private String name;
	private Integer position;

	private static final int LIMIT = 1000;
	private static boolean isFinish = false;

	public Car(String name) {
		super();
		this.name = name;
		this.position = 0;
	}

	public void race() throws Exception {
		while (!isFinish) {

			this.position += (int) (Math.random() * 100);

			synchronized (System.out) {

				for (int i = 0; i < this.position / 30; i++) {
					System.out.print(".");
				}
				System.out.println(this.name + ": " + this.position);
			}

			if (this.position >= LIMIT) {
				isFinish = true;
				break;
			}
			Thread.sleep(500);
		}

	}

	@Override
	public void run() {

		try {
			race();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

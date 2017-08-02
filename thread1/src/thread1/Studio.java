package thread1;

public class Studio {

	public static void main(String[] args) {

		Car[] cars = { new Car("1번"), new Car("2번"), new Car("3번"), new Car("4번") };

		for (int i = 0; i < cars.length; i++) {

			cars[i].start();

		}

	}

}

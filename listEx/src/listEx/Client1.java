package listEx;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("192.168.0.13", 5555);
		System.out.println(socket);

		InputStream in = socket.getInputStream();
		OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");

		while (true) {

			int data = in.read();

			if (data == -1) {
				break;
			}
			out.write(data);
		}

	}

}
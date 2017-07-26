package listEx;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws Exception {

		System.out.println("...server...");

		ServerSocket server = new ServerSocket(5555);

		Socket client = server.accept();

		System.out.println(client);

		OutputStream out = client.getOutputStream();

		InputStream in = new FileInputStream("C:\\zzz\\bbb.jpg");

		while (true) {

			int data = in.read();
			if (data == -1) {break;}
			out.write(data);
		}

	}

}

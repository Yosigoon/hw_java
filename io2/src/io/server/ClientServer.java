package io.server;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientServer {

	public static void main(String[] args) throws Exception {

		System.out.println("...server...");

		ServerSocket server = new ServerSocket(5555);

		String msg = "내일은 없다... \n";

		for (int i = 0; i < 100; i++) {

			Socket client = server.accept();

			OutputStream out = client.getOutputStream();

			System.out.println(client);

			byte[] arr = msg.getBytes();
			out.write(arr);

			out.close();
			client.close();
		}

	}

}

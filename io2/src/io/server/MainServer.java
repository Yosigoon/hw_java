package io.server;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainServer {

	public static void main(String[] args) throws Exception {

		Map<String, AbstractServer> map = new TreeMap<>();

		map.put("list", new ListServer());
		// map.put("get", new GetServer());

		ServerSocket server = new ServerSocket(5555);

		System.out.println("---------------");

		for (int i = 0; i < 100; i++) {

			Socket client = server.accept();
			InputStream in = client.getInputStream();
			Scanner socketSc = new Scanner(in);
			String msg = socketSc.nextLine();

			//
			OutputStream out = client.getOutputStream();
			//

			System.out.println(msg);
			if (msg.equals("get")) {
				System.out.println("기능 공사중");
			} else if (msg.equals("list")) {
				File directory = new File("C:\\Quiz\\");

				File[] files = directory.listFiles();

				for (File f : files) {

					if (f.isFile()) {

						String fileName = f.getName() + "\n";

						byte[] arr = fileName.getBytes();

						out.write(arr);
					}
				}
			}
		}
		// AbstractServer server = new ListServer();
		//
		// AbstractServer server = map.get(readMsg());

		// map.get(workServer);

	}
}
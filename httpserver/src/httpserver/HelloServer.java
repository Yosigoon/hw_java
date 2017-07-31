package httpserver;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	// bad code
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5555);
		System.out.println("Server Ready...");

		while (true) {

			Socket client = server.accept();
			System.out.println(client);

			OutputStream out = client.getOutputStream();
			
			String msg = "<h1>Hello World</h1>";
			
			//헤더 메세지
			out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
			out.write(new String("Cache-Control: private\r\n").getBytes());
			out.write(new String("Content-Length: " + msg.getBytes().length + "\r\n").getBytes());
			out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
			//
			out.write(msg.getBytes());
			out.flush();
			
			out.close();			
			client.close();
		} // end while

	}

}

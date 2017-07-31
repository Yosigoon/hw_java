package httpserver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ImageServer {

	// bad code
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(5555);
		System.out.println("Server Ready.... ");

		while (true) {

			try {

				Socket client = server.accept();

				new Thread(() -> {
					try {
						OutputStream out = client.getOutputStream();
						Scanner inScanner = new Scanner(client.getInputStream());

						String str = inScanner.nextLine();
						String[] arr = str.split(" ");

						String target = arr[1];

						System.out.println("---------------------");
						System.out.println(target);
						System.out.println("=====================");

						if (target.length() > 1) {
							target = target.substring(1);
						} else {
							target = "music.html";
						}

						String type = target.substring(target.lastIndexOf(".") + 1);

						System.out.println(type);

						System.out.println(str);

						out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
						out.write(new String("Cache-Control: private\r\n").getBytes());
						// out.write(new String("Content-Length: 162489\r\n").getBytes());

						if (type.equalsIgnoreCase("jpg")) {
							out.write(new String("Content-Type: image/jpeg; charset=UTF-8\r\n\r\n").getBytes());

						} else if (type.equalsIgnoreCase("mp3")) {
							out.write(new String("Content-Type: audio/mpeg\r\n\r\n").getBytes());

						} else {

							out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
						}

						InputStream in = new FileInputStream("C:\\music\\" + target);
						byte[] buffer = new byte[1024 * 8];

						while (true) {

							int count = in.read(buffer);
							if (count == -1) {
								break;
							}
							out.write(buffer, 0, count);
						}

						out.flush();

					} catch (Exception e) {

					} finally {

					}
				}).start();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // end while

	}
}

// public class ImageServer {
//
// // bad code
// public static void main(String[] args) throws Exception {
//
// ServerSocket server = new ServerSocket(5555);
// System.out.println("Server Ready...");
//
// while (true) {
//
// try (Socket client = server.accept();
// OutputStream out = client.getOutputStream();
// Scanner inScanner = new Scanner(client.getInputStream());) {
//
//
// String str = inScanner.nextLine();
// String[] arr = str.split(" ");
//
// String target = arr[1];
//
// System.out.println("-------------------------------");
// System.out.println(target);
// System.out.println("===============================");
//
// if(target.length() > 1) {
// target = target.substring(1);
// }else {
// target = "aaa.html";
// }
//
//
// System.out.println(str);
// // 헤더 메세지
// out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
// out.write(new String("Cache-Control: private\r\n").getBytes());
// // out.write(new String("Content-Length: 203314\r\n").getBytes());
// out.write(new String("Content-Type: text/html;
// charset=UTF-8\r\n\r\n").getBytes());
// //
//
// InputStream in = new FileInputStream("C:\\zzz\\" + target);
// byte[] buffer = new byte[1024 * 8];
//
// while (true) {
// int count = in.read(buffer);
// if (count == -1) {
// break;
// }
// out.write(buffer, 0, count);
// }
//
// out.flush();
// } catch (Exception e) {
// System.out.println(e.getMessage());
//
// } // end while
//
// }
//
// }
// }

package thread1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatAgent {

	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private Scanner scanner;

	public ChatAgent(Socket socket) throws Exception {

		this.socket = socket;
		this.in = new DataInputStream(socket.getInputStream());
		this.out = new DataOutputStream(socket.getOutputStream());
		this.scanner = new Scanner(System.in);

	}

	public void readMsg() {

		new Thread(() -> {
			while (true) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				// read other msg
			}
		}).start();

	}

	public void sendMsg() throws IOException {
		
		out.writeUTF("요시:입장");
		
		
		while (true) {

			String msg = "요시:"+scanner.nextLine();
			try {
				out.writeUTF(msg);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			// write my msg

		}

	}

}

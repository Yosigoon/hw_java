package thread1;

import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) throws Exception {

		String ip = "192.168.0.30";
		int port = 5555;
		
		Socket socket = new Socket(ip, port);
		
		ChatAgent agent = new ChatAgent(socket);
		
		agent.readMsg();
		agent.sendMsg();
		
	}

}

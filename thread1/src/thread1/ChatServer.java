package thread1;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) throws Exception{

		ServerSocket server = new ServerSocket(5555);
		
		System.out.println("Ready Server...");
		
		Socket socket = server.accept();

		ChatAgent agent = new ChatAgent(socket);

		agent.readMsg();
		agent.sendMsg();

	}

}

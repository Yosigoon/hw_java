package thread2;

import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiServer {
	private ServerSocket server;
	private List<MultiAgent> list;
	private List<MultiAgent> problems;
	private Map<String, MultiAgent> userMap;

	public MultiServer() throws Exception {

		server = new ServerSocket(5555);
		list = new ArrayList<>();// Vector
		problems = new ArrayList<>();// Vector
		userMap = new HashMap<>();
	}

	public void runServer() throws Exception {
		while (true) {
			Socket client = server.accept();
			System.out.println(client);

			// 사용자 하나 멀티에이전트

			MultiAgent agent = new MultiAgent(client, this); // this 멀티 서버으 ㅣ리모콘
			list.add(agent);
			agent.start();

		}
	}

	public List<MultiAgent> getList() {
		return list;
	}

	public void setList(List<MultiAgent> list) {
		this.list = list;
	}

	public synchronized void broadcast(String msg) {
		// List<MultiAgent> problems = new ArrayList<>();

		for (MultiAgent multiAgent : list) {
			try {
				multiAgent.dos.writeUTF(msg);
			} catch (Exception e) {
				System.out.println("매세지 보낼때 문제가 있음....");
				problems.add(multiAgent);
				// list.remove(multiAgent);
			}
		}

		// 문제아들 정리
		for (MultiAgent prob : problems) {
			list.remove(prob);
		}
		problems.clear();

	}

	// 귓속말
	public void addUser(String nickName, MultiAgent multiAgent) {
		userMap.put(nickName, multiAgent);

	}

	public void sendSecret(String target, String msg) throws Exception {
		userMap.get(target).dos.writeUTF(msg);

	}

}
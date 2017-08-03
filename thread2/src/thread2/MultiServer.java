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

			// ����� �ϳ� ��Ƽ������Ʈ

			MultiAgent agent = new MultiAgent(client, this); // this ��Ƽ ������ �Ӹ�����
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
				System.out.println("�ż��� ������ ������ ����....");
				problems.add(multiAgent);
				// list.remove(multiAgent);
			}
		}

		// �����Ƶ� ����
		for (MultiAgent prob : problems) {
			list.remove(prob);
		}
		problems.clear();

	}

	// �ӼӸ�
	public void addUser(String nickName, MultiAgent multiAgent) {
		userMap.put(nickName, multiAgent);

	}

	public void sendSecret(String target, String msg) throws Exception {
		userMap.get(target).dos.writeUTF(msg);

	}

}
package thread2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

public class MultiAgent extends Thread {

	private Socket socket;
	public DataOutputStream dos;
	private DataInputStream din;
	private MultiServer server;

	public MultiAgent(Socket socket, MultiServer server) throws Exception { // ������

		this.socket = socket;
		this.din = new DataInputStream(socket.getInputStream());
		this.dos = new DataOutputStream(socket.getOutputStream());
		this.server = server;
	}

	@Override
	public void run() {

		try {
			readMsg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		} finally {
			try {
				dos.close();
			} catch (Exception e) {
			}
			try {
				din.close();
			} catch (Exception e) {
			}
			try {
				socket.close();
			} catch (Exception e) {
			}
		}
	}

	public void readMsg() throws Exception {

		boolean isFirst = true;// �ӼӸ�

		while (true) {

			String msg = din.readUTF();
			System.out.println(msg);

			// �ӼӸ�
			String[] arr = msg.split(":");

			if (isFirst) {
				server.addUser(arr[0], this);
				isFirst = false;
			}

			if (arr.length == 3) {
				try {
					server.sendSecret(arr[1],msg);
				}catch(Exception e) {
					dos.writeUTF("�ӼӸ� ����");
				}
				continue;
			}

			// ���� ���� ���
			// server.getList().forEach(agent->{
			// try {
			// agent.dos.writeUTF(msg);
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// });

			// �̹������ �ڵ��� (���� ���ܼ� ������ �ű�)
			// List<MultiAgent> list= server.getList();
			// for (MultiAgent multiAgent : list) {
			// multiAgent.dos.writeUTF(msg);

			// ������ �ű�� �ؿ� �ڵ� �ۼ�
			server.broadcast(msg);

		}

	}
}
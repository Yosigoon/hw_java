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

	public MultiAgent(Socket socket, MultiServer server) throws Exception { // 생성자

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

		boolean isFirst = true;// 귓속말

		while (true) {

			String msg = din.readUTF();
			System.out.println(msg);

			// 귓속말
			String[] arr = msg.split(":");

			if (isFirst) {
				server.addUser(arr[0], this);
				isFirst = false;
			}

			if (arr.length == 3) {
				try {
					server.sendSecret(arr[1],msg);
				}catch(Exception e) {
					dos.writeUTF("귓속말 실패");
				}
				continue;
			}

			// 따로 쓰는 방법
			// server.getList().forEach(agent->{
			// try {
			// agent.dos.writeUTF(msg);
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// });

			// 이방법으로 코딩함 (문제 생겨서 서버로 옮김)
			// List<MultiAgent> list= server.getList();
			// for (MultiAgent multiAgent : list) {
			// multiAgent.dos.writeUTF(msg);

			// 서버로 옮기고 밑에 코드 작성
			server.broadcast(msg);

		}

	}
}
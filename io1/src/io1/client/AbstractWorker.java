package io1.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public abstract class AbstractWorker {

	protected Socket makeSocket(String ip, int port) throws Exception {
		return new Socket(ip, port);
	}

	protected void sendMsg(OutputStream out, String msg) throws Exception {

		out.write((msg + "\n").getBytes());
	}

	protected abstract String readMsg(InputStream in) throws Exception;

	public final void work(String ip, int port, String msg) throws Exception {

		// ���� ����
		Socket socket = makeSocket(ip, port);

		// ������
		sendMsg(socket.getOutputStream(), msg);
		// �ޱ�
		String result = readMsg(socket.getInputStream());

		System.out.println(result);

	}
}

package listEx;

import java.io.InputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameUI  {

	List<String> ipList;
	Scanner keyScanner;

	public GameUI() throws Exception {

		keyScanner = new Scanner(System.in);

		ipList = new ArrayList<>();
		ipList.add("192.168.0.11");
		ipList.add("192.168.0.12");
		ipList.add("192.168.0.13");
		ipList.add("192.168.0.14");
		
		Collections.shuffle(ipList);

	}

	public void startGame() throws Exception {

		if (ipList.size() == 0) {
			return;
		}

		System.out.format("0번 부터 %d번까지..", ipList.size() - 1);

		int idx = Integer.parseInt(keyScanner.nextLine());

		String targetIp = ipList.remove(idx);

		System.out.println(targetIp);
		
		connectServer(targetIp);

		startGame();

	}

	private void connectServer(String targetIp) throws Exception {
		
		Socket socket = new Socket(targetIp, 5555);
		InputStream in = socket.getInputStream();
		Scanner inScanner = new Scanner(in);
		
		System.out.println(inScanner.nextLine());
		
		
	}

	public static void main(String[] args) throws Exception {
		GameUI ui = new GameUI();

		ui.startGame();
	}

}

package io.server;

import java.io.InputStream;
import java.util.Scanner;

public class ListServer extends AbstractServer {

	protected String readMsg(InputStream in) throws Exception {

		Scanner scanner = new Scanner(in);
		String msg = scanner.nextLine();

		return msg;
	}
}

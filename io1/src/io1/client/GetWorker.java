package io1.client;

import java.io.InputStream;
import java.util.Scanner;

public class GetWorker extends AbstractWorker {

	@Override
	protected String readMsg(InputStream in) throws Exception {

		Scanner scanner = new Scanner(in);
		String msg = scanner.nextLine();

		return msg;
	}

}

package io1.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ListWorker extends AbstractWorker{

	@Override
	protected String readMsg(InputStream in) throws Exception {

		return "list";
	}


}

package httpserver2.let;

import java.io.OutputStream;

import httpserver2.AbstractAgent;

public class Hellolet extends AbstractAgent {

	public Hellolet(String target, OutputStream out) {
		super(target, out);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() throws Exception {
		makeHeader();
		out.write("Content-Type: text/html; charset=UTF-8\r\n\r\n".getBytes());
		
		out.write("<h1>Hell World</h1>".getBytes());


	}

}

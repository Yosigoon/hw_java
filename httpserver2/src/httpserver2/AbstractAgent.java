package httpserver2;

import java.io.OutputStream;

public abstract class AbstractAgent {

	protected String target;
	protected OutputStream out;
	
	public AbstractAgent(String target, OutputStream out) {
		this.target = target;
		this.out = out;
	}
	
	
	protected void makeHeader() throws Exception{
		
		out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
	    out.write(new String("Cache-Control: private\r\n").getBytes()); 
	    
	}
	
	public abstract void service() throws Exception;
}

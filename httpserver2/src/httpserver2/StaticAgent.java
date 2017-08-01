package httpserver2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class StaticAgent extends AbstractAgent {
	
	private String suffix;
	private Map<String, String> mimeMap;

	public StaticAgent(String target, String suffix, OutputStream outputStream) {

		super(target, outputStream);
		
		this.suffix = suffix;
		mimeMap = new HashMap<>();
		mimeMap.put("jpg","Content-Type: image/jpeg; charset=UTF-8\r\n\r\n");
		mimeMap.put("mp3","Content-Type: audio/mpeg\r\n\r\n");
		mimeMap.put("html","Content-Type: text/html; charset=UTF-8\r\n\r\n");		
	}
	


	public void service() throws Exception {

		System.out.println("==================");
		System.out.println(this.target);
		System.out.println(this.suffix);
		System.out.println(this.mimeMap.get(this.suffix));
		
		makeHeader();
		
		String mimeType = mimeMap.get(this.suffix);
		
	    out.write(mimeType.getBytes());

	    
	    InputStream fin = new FileInputStream("C:\\zzz"+target);
	    
	    byte[] buffer = new byte[1024*8];
	    
	    while(true) {
	    	int count = fin.read(buffer);
	    	if(count == -1) { break; }
	    	out.write(buffer,0, count);
	    }
	    
	    out.flush();	
	    fin.close();
		
	}

}







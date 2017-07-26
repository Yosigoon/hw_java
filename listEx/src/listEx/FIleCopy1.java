package listEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class FIleCopy1 {
	
	public static void main(String[] args) throws Exception{
		
		String str = "http://postfiles10.naver.net/MjAxNzA3MjFfMjIy/MDAxNTAwNjM3MTAxNzgx.Nj_sAFv6iDqVsVVVIayOntXwaUpMMEZU_3VGpFtp_0Eg.RlCXIFQjXevj9N34-pr-LzWQSMzwAM0d2DQo1TfitEkg.JPEG.lalacucina/IMG_5216_copy.jpg?type=w773"; 
		
		URL url = new URL(str);
		
		InputStream in = url.openStream();
		
		OutputStream out = new FileOutputStream("C:\\zzz\\bbb.jpg");
		
		while(true) {
			
			int data = in.read();
			
			if(data==-1) {
				break;
			}
			
			out.write(data);
			
		}
		
		
		
	}

}

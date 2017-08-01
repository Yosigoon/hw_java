package httpserver2;

import java.net.URL;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)throws Exception {
		
		for (int i = 0; i < 10; i++) {
			
			new Thread(()  ->{
				try {
					String path ="http://display.cjmall.com/p/category/categoryMain?dpCateId=G00029&pic=GNBA_lcat_seq-02";
					
					URL url = new URL(path);
					
					Scanner scanner = new Scanner(url.openStream(),"UTF-8");
					
					System.out.println(scanner.nextLine());
					System.out.println("-----------------");
					scanner.close();	
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}).start(); 
			
		
		}		
	}
}

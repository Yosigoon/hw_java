package httpserver2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class MakeContent {

	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:\\zzz");
		
		String[] files = dir.list((d,fname) -> fname.endsWith(".mp3") );
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		
		Scanner scanner = new Scanner(new FileInputStream("C:\\zzz\\aaa.html"),"UTF-8");
		
		while(true) {
			
			String line = scanner.nextLine();
			line = line.replaceAll("\"", "\'");
			System.out.println("out.write(\"" +line+"\".getBytes(\"UTF-8\"));");
			
			
		}
		
	}
}

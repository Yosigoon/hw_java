package io1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FileSender {

	//bad code
	public static void main(String[] args) throws Exception{
		
		ServerSocket server = new ServerSocket(5555);	
		
		System.out.println("---------------");
		
		for(int i = 0; i <100;i++) {
			Socket socket = server.accept();
			
			System.out.println("Connected....");
			
			InputStream sin = socket.getInputStream();
			Scanner ins = new Scanner(sin);
			
			String fileName = ins.nextLine();
			
			OutputStream out = socket.getOutputStream();
			
			InputStream in = new FileInputStream("C:\\zzz\\"+fileName);
			
			byte[] buffer = new byte[1024*8];
			int count = 0; 
			
			while(true) {
				
				count = in.read(buffer);
				
				if(count == -1) { break; }
				
				out.write(buffer,0, count);
				
			}
			
			
			out.close();
			socket.close();
			
		}
		
	
		
		
	
	}
	
}

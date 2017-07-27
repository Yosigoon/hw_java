package io1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) throws Exception{
		
		Scanner keyScanner = new Scanner(System.in);
		
		System.out.println("파일의 이름을 입력하세요");
		
		String fileName = keyScanner.nextLine()+"\n";
		
		byte[] msg = fileName.getBytes();
		
		Socket socket = new Socket("192.168.0.36", 5555);
		
		System.out.println(socket);
		
		InputStream in = socket.getInputStream();
		OutputStream sout = socket.getOutputStream();
		
		OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");
		
		sout.write(msg);
		
		while(true) {
			
			int data = in.read();
			
			if(data == -1) { break; }
			
			out.write(data);
			
		}
		
	}
}

package io3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataReadTest {
	
	//bad code
	public static void main(String[] args) throws Exception {
		
		DataInputStream din = new DataInputStream(new FileInputStream("C:\\zzz\\data.dat"));
		
		System.out.println(din.readInt());
		System.out.println(din.readFloat());
		System.out.println(din.readUTF());
		
		din.close();
		
		
		
	}

}

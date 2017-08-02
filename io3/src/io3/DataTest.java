package io3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataTest {

	public static void main(String[] args) throws Exception {

		OutputStream out = new FileOutputStream("C:\\zzz\\data.dat");

		DataOutputStream dos = new DataOutputStream(out);

		// int, float, string
		dos.writeInt(5959);
		dos.writeFloat(210.8F);
		dos.writeUTF("ÇõÀÚ");
		dos.writeInt(5959);
		dos.writeFloat(210.8F);
		dos.writeUTF("ÇõÀÚ");

		dos.close();
		out.close();

	}

}

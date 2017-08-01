package httpserver2.let;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import httpserver2.AbstractAgent;

public class Quizlet extends AbstractAgent {

	public Quizlet(String target, OutputStream out) {
		super(target, out);

	}

	@Override
	public void service() throws Exception {

//		InputStream fin = new FileInputStream("C:\\zzz\\aaa.html");

		makeHeader();

		out.write("Content-Type: text/html; charset=UTF-8\r\n\r\n".getBytes());

		out.write("<h1>Quiz Show!!!</h1>".getBytes());
		
		out.write("".getBytes());
		out.write("<h1>Quiz No.1 <br>".getBytes());
		out.write("    송송커플이 같이 출연한 드라마는?</h1>".getBytes("UTF-8"));
		out.write("<h3><a href='a1.html'>1.아내의 유혹</a> </h3>".getBytes("UTF-8"));
		out.write("<h3><a href='a1.html'>2.도깨비</a> </h3>".getBytes("UTF-8"));
		out.write("<h3><a href='b1.html'>3.태양의 후예</a> </h3>".getBytes("UTF-8"));
		out.write("<iframe img src='s.jpg' width='600px' height='650px'></iframe></br>".getBytes("UTF-8"));

//		byte[] buffer = new byte[1024 * 8];
//
//		while (true) {
//			int count = fin.read(buffer);
//			if (count == -1) {
//				break;
//			}
//			out.write(buffer, 0, count);
//		}
//
//		out.flush();
//		fin.close();

	}

}

package httpserver2.let;

import java.io.OutputStream;

import httpserver2.AbstractAgent;

public class Musiclet extends AbstractAgent {

	public Musiclet(String target, OutputStream out) {
		super(target, out);
	}

	@Override
	public void service() throws Exception {
		
		makeHeader();
		out.write("Content-Type: text/html; charset=UTF-8\r\n\r\n".getBytes());
		
		out.write("<style>".getBytes());
		out.write("li { list-style:none}".getBytes());
		//out.write("iframe {width:100%; height:50px; border:0px;}".getBytes());
		out.write("</style>".getBytes());
		out.write("".getBytes());
		out.write("<div>".getBytes());
		out.write("  <ul>".getBytes());
		out.write("  <li><a href='RedVelvet.mp3' target='song'>RedVelvet.mp3</a></li>".getBytes());
		out.write("  <li><a href='SeeYouAgain.mp3' target='song'>SeeYouAgain.mp3</a></li>".getBytes());
		out.write("  <li><a href='CheerUp.mp3' target='song'>CheerUp.mp3</a></li>".getBytes());
		out.write("  <li><a href='Artist.mp3' target='song'>Artist.mp3</a></li>".getBytes());
		out.write("  </ul>".getBytes());
		out.write("</div>".getBytes());
		out.write("<iframe name='song'></iframe>".getBytes());

	}

}

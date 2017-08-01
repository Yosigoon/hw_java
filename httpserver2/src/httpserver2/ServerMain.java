package httpserver2;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception{

		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\zzz\\server.properties"));
		
		
		ServerSocket server = new ServerSocket(5555);
		
		while(true) {
		
			Socket client = server.accept();
		
			new Thread(()->{
				
				try {
					Scanner scanner = new Scanner(client.getInputStream(),"UTF-8");
					String line = scanner.nextLine();
					
					System.out.println(line);
					
					String target = line.split(" ")[1];
					
					if(target.length() < 2) {
						target = "/aaa.html";
					}
					
					String suffix = target.substring(target.lastIndexOf(".")+1);
					
					System.out.println("suffix: " + suffix);
					
					if(suffix.startsWith("java96")) {
						
						System.out.println("java96 dynamic conent");
						
						String className = prop.getProperty(target);
						
						System.out.println("Class Name: " + className);
						
						Class clz = Class.forName(className);
						
						Constructor con = clz.getConstructor(String.class, OutputStream.class);
						
						Object obj = con.newInstance(target, client.getOutputStream());
						
						clz.getMethod("service").invoke(obj);
						
						//new Musiclet(target,client.getOutputStream()).service();
				
					}else if (suffix.startsWith("ico")) {
						System.out.println("ico resources");
						
											
					}else {
						System.out.println("static resources");
						
						new StaticAgent(target, suffix, client.getOutputStream()).service();
						
					}
					
					
					System.out.println(client);
					scanner.close();
					client.close();
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}				
			}).start();
		}//while		
		
	}
}




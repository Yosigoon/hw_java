import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import io1.client.AbstractWorker;
import io1.client.GetWorker;
import io1.client.ListWorker;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Map<String, AbstractWorker> map = new TreeMap<>();
		map.put("list", new ListWorker());
		map.put("get", new GetWorker());
		
		String ip = "127.0.0.1";
		int port = 5555;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("input");
		
		String msgStr = scanner.nextLine(); 
		String[] msg = msgStr.split(" ");
		
		AbstractWorker worker = map.get(msg[0]);
		
		worker.work(ip, port, msgStr);
		
	}
}

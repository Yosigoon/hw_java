package food;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) throws Exception{
		
		File file = new File("C:\\zzz\\sample.txt");
		Scanner scanner = new Scanner(file);
		
		while(true) {
			try {
				String line = scanner.nextLine();
				System.out.println(line);
				
				String[] arr = line.split(",");
				
				System.out.println(Arrays.toString(arr));

			}catch(Exception e) {
				break;
			}			
		}		
	}
}

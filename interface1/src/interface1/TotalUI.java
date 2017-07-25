package interface1;

import java.util.Scanner;

public class TotalUI {
	

	Scanner scanner;
	
	public TotalUI() {
		scanner = new Scanner(System.in);
	}
	
	public void execute() throws Exception{
		
		System.out.println("원하는 UI클래스 이름을 입력하세요");
		
		AbstractUI ui = (AbstractUI)(Class.forName("interface1." +scanner.nextLine()).newInstance());
		
		double area = ui.makeShape().getArea();
		
		System.out.println(area);
	}
	
	
	

	public static void main(String[] args) throws Exception{
		TotalUI ui = new TotalUI();
		ui.execute();
	}
}

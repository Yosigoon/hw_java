package interface1;

import java.util.Scanner;

public class ReverseUI {

	Scanner scanner;
	IReverse reverse;
	
	public ReverseUI(IReverse res) {
		super();
		this.reverse = res;
		scanner = new Scanner(System.in);
	}
	
	public void show() {
		
		System.out.println("단어를 입력하세요");
		
		String word = scanner.nextLine();
		
		String result = reverse.reverse(word);
		
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
		IReverse obj = new SimpleReverse();
		
		ReverseUI ui = new ReverseUI(obj);
		
		ui.show();
		
	}
	
	
	
}

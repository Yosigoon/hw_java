package oop2;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class LottoUI {

	Scanner scanner;
	LottoMachine machine;

	public LottoUI(LottoMachine machine) {
		scanner = new Scanner(System.in);
		this.machine = machine;

	}

	
	void showUsage() {
		
		out.println("Welcome Lotto Service! ");
		out.println("Start Y???");
	}
		
	public void runTask() {
		
		int money = inputInt("������ ��������");
		
		for (int i = 0; i < money/1000; i++) {
			System.out.println("��ȣ�� �̰ڽ��ϴ�.");
			
			LottoBall[] balls = machine.select(6);
			System.out.println(Arrays.toString(balls));
			
		}
		
		String cmd = input("����ҷ�? �� ����?");
		
		if(cmd.equalsIgnoreCase("n")) {
			return;
		}
		runTask();
		
		
	}
	private String input(String string) {
		System.out.println(string);
		return scanner.nextLine();

	}

	private int inputInt(String string) {
		return Integer.parseInt(input(string));
	}

}

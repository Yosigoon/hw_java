package oop1;

import java.util.Scanner;

public class PiggySaveUI {

	Scanner scanner;
	PiggySave save;
	
	public PiggySaveUI(PiggySave piggy) {
		scanner = new Scanner(System.in);
		save = piggy;
	}
	
	
	public void init() {
		System.out.println("1.�Ա�, 2.���, -1:����");
		String oper = scanner.nextLine();
		
		switch (oper) {
		case "1":
			System.out.println("��..");
			break;
		case "2":
			System.out.println("��¥?");
			break;	
		case "-1":
			
			return;
		}
		
		
		init();
	}
	
	public void end() {
		
	}
	
}

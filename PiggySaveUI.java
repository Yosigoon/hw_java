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
		System.out.println("1.입금, 2.출금, -1:종료");
		String oper = scanner.nextLine();
		
		switch (oper) {
		case "1":
			System.out.println("얼마..");
			break;
		case "2":
			System.out.println("진짜?");
			break;	
		case "-1":
			
			return;
		}
		
		
		init();
	}
	
	public void end() {
		
	}
	
}

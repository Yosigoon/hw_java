package hw;

import java.util.Scanner;

public class CalculatorUI {
	CalculatorMachine machine = new CalculatorMachine(); 
	Scanner sc;
	


	public void show() {
		sc = new Scanner(System.in);
		System.out.println("1.+");
		System.out.println("2.-");
		
		
		int oper=sc.nextInt();
		switch (oper) {
		case 1:
			System.out.print("a�� �Է��ϼ��� >>");
			int  a = sc.nextInt();
			System.out.println("b�� �Է��ϼ��� >>");
			int  b = sc.nextInt(); 	
			
			System.out.println(machine.CalculatorPlus(a, b)) ; 
			break;
		case 2: 
			System.out.print("a�� �Է��ϼ��� >>");
			int  c = sc.nextInt();
			System.out.println("b�� �Է��ϼ��� >>");
			int  d = sc.nextInt(); 	
			
			System.out.println(machine.CalculatorMinus(c, d)) ; 
			
			break;
			}
		
		
		
		
		
		
	}
	
	

}

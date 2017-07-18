package oop2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		LottoMachine machine = new LottoMachine(45);
			
		LottoUI ui = new LottoUI(machine);
		ui.showUsage();
		ui.runTask();
	}
}
package oop2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LottoMachineTest {
	
	LottoMachine machine;

	@Before
	public void setUp() throws Exception {
		machine = new LottoMachine(45);
	}

	@Test
	public void test() {
		
		LottoBall[] result = machine.select(6);
		
		for (LottoBall lottoBall : result) {
			System.out.println(lottoBall);
		}
	}

}

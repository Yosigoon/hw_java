package oop2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LottoMachine {

	LottoBall[] balls;

	public LottoMachine(int count) {
		balls = new LottoBall[count];

		IntStream.range(1, count + 1).forEach(i -> {
			balls[i - 1] = new LottoBall(i);

			// for(int i = 1; i <=45; i++) {
			// balls[i-1] = new LottoBall(i);
		});

	}

	public LottoBall[] select(int num) {
		
//		System.out.println("DEBUG" + Arrays.toString(balls));
		
		LottoBall[] result = new LottoBall[num];

		for (int i = 0; i < num; i++) {

			int idx = (int) (Math.random() * balls.length);
			if (balls[idx].askSelected()) {
				i--;
				continue;
			}
			
			result[i] = balls[idx];

		} // end for	
		
		
		reset();
		for (int i = result.length-1; i > 0 ; i--) {
			for (int j = 0; j < i; j++) {
				if (result[j].num > result[j+1].num) {
					LottoBall temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
				}
			}
		}
		return result;
		
		
	}

	

	private void reset() {
		
		for (LottoBall lottoBall : balls) {
			if(lottoBall.selected) {
				lottoBall.selected = false;
			}
		}
		

		
	}

}

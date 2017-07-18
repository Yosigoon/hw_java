package hw;

public class Ex1 {

	public static void main(String[] args) {

		
		int Hsum = 0;
		int JJsum = 0;
		
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				JJsum = JJsum + i;
							
			}else {
				Hsum = Hsum + i;
			}
			System.out.println("È¦¼öÀÇ ÇÕ : "+Hsum);
			System.out.println("================");
			System.out.println("Â¦¼öÀÇ ÇÕ : "+JJsum);
		}
	}
}


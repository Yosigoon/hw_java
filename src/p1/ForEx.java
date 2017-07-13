package p1;

public class ForEx {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 0 ) {
				System.out.println("EVEN : " + i);
				continue;
			}
			System.out.println("ODD :" + i);
			
		}
	
	}

}

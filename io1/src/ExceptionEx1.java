
public class ExceptionEx1 {
	
	private static double doA(int a, int b) {
		try {
			return a/b;
		}catch (Exception e) {
			return 0;
		}finally {
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(doA(10,0));
		
	}

}

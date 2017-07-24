public class ZRamen extends Ramen {

	@Override
	public void cook() {
		before();
		System.out.println("짜장 라면은 중간에 물을 버려야해!!");
		after();

	}

}
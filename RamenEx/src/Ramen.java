public class Ramen {

	public void cook() {
		before();
		System.out.println("면과 스프를 넣고 4분 30초");
		after();
	}

	public void after() {
		System.out.println("그릇에 담아");
	}

	public void before() {
		System.out.println("물을 끓입니다");
	}
}
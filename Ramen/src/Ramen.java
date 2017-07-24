public class Ramen {

	public void cook() {

		before();
		System.out.println("면과 스프를 넣고 4분 30초 삶기");
		after();

	}

	public void after() {
		System.out.println("그릇에 담는다");
	}

	public void before() {
		System.out.println("물 끓이기");
	}

}
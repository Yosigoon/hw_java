public class ZRamen extends Ramen {

	@Override
	public void cook() {
		before();
		System.out.println("���� ������ ������ ��");
		after();
	}

}
package interface1;

public class CircleUI extends AbstractUI {

	@Override
	public IArea makeShape() {
		System.out.println("���� ����� UI");
		double radius = getDouble("������");
		
		Circle obj = new Circle();
		obj.radius = radius;
		
		return obj;
	}

}

package interface1;

public class CircleUI extends AbstractUI {

	@Override
	public IArea makeShape() {
		System.out.println("원을 만드는 UI");
		double radius = getDouble("반지름");
		
		Circle obj = new Circle();
		obj.radius = radius;
		
		return obj;
	}

}

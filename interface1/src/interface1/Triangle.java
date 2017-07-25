package interface1;

public class Triangle implements IArea {

	int bottom;
	int height;
	
	@Override
	public double getArea() {
		return (bottom * height) / 2.0;
	}

}

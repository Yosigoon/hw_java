package interface1;

public class Circle implements IArea {

	double radius;
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}

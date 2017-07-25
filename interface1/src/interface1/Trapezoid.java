package interface1;

public class Trapezoid implements IArea {

	int upper;
	int lower;
	int height;
	
	@Override
	public double getArea() {
		
		return ((upper + lower) * height)/ 2.0;
	}

}

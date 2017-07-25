package interface1;

public class Rectangle implements IArea {

	int width;
	int ver;
	
	@Override
	public double getArea() {
		return width * ver * 1.0;
	}

}

package oop1;

public class Train {

	String name;
	double position;
	double speed;
	
	public Train(String name, double position, double speed) {
		super();
		this.name = name;
		this.position = position;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", position=" + position + ", speed=" + speed + "]";
	}

	public double runMin() {
		
		position += (speed/60);
		
		return position;
	}
	
	
	
}

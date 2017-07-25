package interface1;

public class TrapezoidUI extends AbstractUI {

	@Override
	public IArea makeShape() {
		Trapezoid obj = new Trapezoid();
		
		obj.upper = getInt("Upper");
		obj.lower = getInt("lower");
		obj.height = getInt("height");
		return obj;
	}

}

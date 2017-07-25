package interface1;

public class RectangleUI extends AbstractUI {

	@Override
	public IArea makeShape() {
		
		System.out.println("Rectangle........");
		
		Rectangle obj = new Rectangle();
		
		obj.ver = getInt("height");
		obj.width = getInt("width");
		
		return obj;
	}

}

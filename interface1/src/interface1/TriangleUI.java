package interface1;

public class TriangleUI extends AbstractUI {

	@Override
	public IArea makeShape() {
		System.out.println("�ﰢ�� �����");
		
		int w = getInt("width");
		int h = getInt("height");
		
		Triangle  obj = new Triangle();
		obj.bottom = w;
		obj.height = h;
		
		return obj;
	}

}

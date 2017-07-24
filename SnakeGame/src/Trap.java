public class Trap extends Tile {

	public Trap(String name) {
		super(name);
	}
	
	public boolean pass(Player player) {
		return false;
	}

}
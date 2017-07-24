
public class Tile {
	String name;

	public Tile(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public boolean pass(Player player) {
		return true;
	}

}

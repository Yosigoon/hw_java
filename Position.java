package oop1;

public class Position {

	String name;
	Double lat;
	Double lng;

	public Position(String name, Double lat, Double lng) {
		super();
		this.name = name;
		this.lat = lat;
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "Position [name=" + name + ", lat=" + lat + ", lng=" + lng + "]";
	}

}

package oop1;

public class PositionCalculator {

	public static void main(String[] args) {
		
		Position[] arr = {
			new Position("A",11D,13D),
			new Position("B",21D,23D),
			new Position("C",31D,33D),
			new Position("D",41D,43D)
		};
		
		Position current = new Position("My",10D,10D);
		
		System.out.println(arr[0]);
		
		for (Position position : arr) {
			double distance = PositionUtil.calcDistance(current, position);
			System.out.println(distance);
		}
		
	}
}

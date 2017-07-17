package oop1;

public class PositionUtil {
	

	public static Double calcDistance(Position a, Position b ) {
		double result = 0.0;
		
		result = Math.sqrt(Math.pow((a.lat - b.lat),2) + 
				Math.pow((a.lng - b.lng),2));		
		
		return result;
	}
	
}

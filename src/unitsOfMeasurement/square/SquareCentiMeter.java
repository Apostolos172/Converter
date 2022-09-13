package unitsOfMeasurement.square;

public class SquareCentiMeter {

	public SquareCentiMeter() {
		// TODO Auto-generated constructor stub
	}
	
	public static double toSquareMilliMeters(double squareCentiMeters) {
		return squareCentiMeters*100;
	}
	
	public static double toSquareDeciMeters(double squareCentiMeters) {
		return squareCentiMeters/100;
	}
	
	public static double toSquareMeters(double squareCentiMeters) {
		return squareCentiMeters/Math.pow(10, 4);
	}
	
	public static double toStremma(double squareCentiMeters) {
		return squareCentiMeters/Math.pow(10, 7);
	}
	
	public static double toSquareKiloMeters(double squareCentiMeters) {
		return squareCentiMeters/Math.pow(10, 10);
	}

}

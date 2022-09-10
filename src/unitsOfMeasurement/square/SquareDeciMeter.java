package unitsOfMeasurement.square;

public class SquareDeciMeter {

	public SquareDeciMeter() {
	}
	
	public static double toSquareMilliMeter(double squareDeciMeters) {
		return squareDeciMeters*Math.pow(10, 4);
	}
	
	public static double toSquareCentiMeter(double squareDeciMeters) {
		return squareDeciMeters*Math.pow(10, 2);
	}
	
	public static double toSquareMeter(double squareDeciMeters) {
		return squareDeciMeters*Math.pow(10, -2);
	}
	
	public static double toStremma(double squareDeciMeters) {
		return squareDeciMeters*Math.pow(10, -5);
	}
	
	public static double toSquareKiloMeter(double squareDeciMeters) {
		return squareDeciMeters*Math.pow(10, -8);
	}

}

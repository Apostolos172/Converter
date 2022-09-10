package unitsOfMeasurement.square;

public class SquareMilliMeter {

	public SquareMilliMeter() {
	}
	
	public static double toSquareCentiMeter(double squareMilliMeters) {
		return squareMilliMeters/100;
	}
	
	public static double toSquareDeciMeter(double squareMilliMeters) {
		return squareMilliMeters/Math.pow(10, 4);
	}
	
	public static double toSquareMeter(double squareMilliMeters) {
		return squareMilliMeters/Math.pow(10, 6);
	}
	
	public static double toStremma(double squareMilliMeters) {
		return squareMilliMeters/Math.pow(10, 9);
	}
	
	public static double toSquareKiloMeter(double squareMilliMeters) {
		return squareMilliMeters/Math.pow(10, 12);
	}

}

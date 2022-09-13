package unitsOfMeasurement.square;

public class SquareMeter {

	public SquareMeter() {
	}
	
	public static double toSquareDeciMeter(double squareMeters) {
		return squareMeters*100;
	}
	
	public static double toSquareCentiMeter(double squareMeters) {
		return squareMeters*10000;
	}
	
	public static double toSquareMilliMeter(double squareMeters) {
		return squareMeters*1000000;
	}
	
	public static double toStremma(double squareMeters) {
		return squareMeters/1000;
	}
	
	public static double toSquareKiloMeter(double squareMeters) {
		return squareMeters/1000000;
	}
}

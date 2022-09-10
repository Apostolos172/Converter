package unitsOfMeasurement.square;

public class SquareKilometer {

	public SquareKilometer() {
	}
	
	public static double toStremma(double squareKilometers) {
		return squareKilometers*1000;
	}

	public static double toSquareMeter(double squareKilometers) {
		return squareKilometers*1000000;
	}
	
	public static double toSquareDeciMeter(double squareKilometers) {
		return squareKilometers*Math.pow(10, 8);
	}
	
	public static double toSquareCentiMeter(double squareKilometers) {
		return squareKilometers*Math.pow(10, 10);
	}
	
	public static double toSquareMilliMeter(double squareKilometers) {
		return squareKilometers*Math.pow(10, 12);
	}
}

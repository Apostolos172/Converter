package unitsOfMeasurement;

public class CubicMeter {

	public static double toCubicDeciMeter(double cubicMeters) {
		return cubicMeters*1000;
	}
	
	public static double toCubicCentiMeter(double cubicMeters) {
		return cubicMeters*Math.pow(10, 6);
	}

	public static double toCubicMilliMeter(double cubicMeters) {
		return cubicMeters*Math.pow(10, 9);
	}
}

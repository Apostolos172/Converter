package unitsOfMeasurement;

public class CubicDeciMeter {

	public CubicDeciMeter() {
	}
	
	public static double toCubicMeter(double cubicDeciMeters) {
		return cubicDeciMeters/1000;
	}

	public static double toCubicCentiMeter(double cubicDeciMeters) {
		return cubicDeciMeters*1000;
	}
	
	public static double toCubicMilliMeter(double cubicDeciMeters) {
		return cubicDeciMeters*Math.pow(10, 6);
	}
}

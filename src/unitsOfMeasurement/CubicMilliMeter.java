package unitsOfMeasurement;

public class CubicMilliMeter {

	public CubicMilliMeter() {
		// TODO Auto-generated constructor stub
	}
	
	public static double toCubicMeter(double cubicMilliMeters) {
		return cubicMilliMeters*Math.pow(10, -9);
	}
	
	public static double toCubicDeciMeter(double cubicMilliMeters) {
		return cubicMilliMeters*Math.pow(10, -6);
	}
	
	public static double toCubicCentiMeter(double cubicMilliMeters) {
		return cubicMilliMeters*Math.pow(10, -3);
	}

}

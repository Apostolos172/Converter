package unitsOfMeasurement;

public class CubicCentiMeter {

	public CubicCentiMeter() {
		// TODO Auto-generated constructor stub
	}
	
	public static double toCubicMeter(double cubicCentiMeters) {
		return cubicCentiMeters*Math.pow(10, -6);
	}
	
	public static double toCubicDeciMeter(double cubicCentiMeters) {
		return cubicCentiMeters/1000;
	}
	
	public static double toCubicMilliMeter(double cubicCentiMeters) {
		return cubicCentiMeters*1000;
	}

}

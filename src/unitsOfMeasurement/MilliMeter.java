package unitsOfMeasurement;

public class MilliMeter {

	public MilliMeter() {
		// TODO Auto-generated constructor stub
	}

	public static double toKiloMeter(double millimeters) {
		return millimeters/Math.pow(10, 6);
	}
	
	public static double toMeter(double millimeters) {
		return millimeters/Math.pow(10, 3);
	}
	
	public static double toDeciMeter(double millimeters) {
		return millimeters/Math.pow(10, 2);
	}
	
	public static double toCentiMeter(double millimeters) {
		return millimeters/Math.pow(10, 1);
	}
}

package unitsOfMeasurement;

public class KiloMeter {

	public KiloMeter() {
		// TODO Auto-generated constructor stub
	}
	
	public static double toMeter(double kiloMeters) {
		return kiloMeters*Math.pow(10, 3);
	}
	
	public static double toDeciMeter(double kiloMeters) {
		return kiloMeters*Math.pow(10, 4);
	}
	
	public static double toCentiMeter(double kiloMeters) {
		return kiloMeters*Math.pow(10, 5);
	}
	
	public static double toMilliMeter(double kiloMeters) {
		return kiloMeters*Math.pow(10, 6);
	}

}

package unitsOfMeasurement;

public class CentiMeter {

	public CentiMeter() {
		// TODO Auto-generated constructor stub
	}

	public static double toKiloMeters(double centimeters) {
		return centimeters*Math.pow(10, -5);
	}
	
	public static double toMeters(double centimeters) {
		return centimeters/100;
	}
	
	public static double toDeciMeters(double centimeters) {
		return centimeters/10;
	}
	
	public static double toMilliMeters(double centimeters) {
		return centimeters*10;
	}
}

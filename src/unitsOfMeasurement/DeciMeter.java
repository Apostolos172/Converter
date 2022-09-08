package unitsOfMeasurement;

public class DeciMeter {

	public DeciMeter() {
		// TODO Auto-generated constructor stub
	}
	
	public static double toKiloMeters(double decimeters) {
		return decimeters*Math.pow(10, -4);
	}
	
	public static double toMeters(double decimeters) {
		return decimeters/10;
	}

	public static double toCentiMeters(double decimeters) {
		return decimeters*10;
	}
	
	public static double toMilliMeters(double decimeters) {
		return decimeters*100;
	}
}

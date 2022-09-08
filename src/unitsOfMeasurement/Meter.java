package unitsOfMeasurement;

public class Meter {

	public Meter() {
		// TODO Auto-generated constructor stub
	}

	public static double toKilometers(double meters) {
		return meters/1000;
	}
	
	public static double toDeciMeters(double meters) {
		return meters*10;
	}
	
	public static double toCentiMeters(double meters) {
		return meters*100;
	}
	
	public static double toMilliMeters(double meters) {
		return meters*1000;
	}
}

package unitsOfMeasurement;

public class Kilo {
	public static double toGram(double kilo) {
		return kilo*1000;
	}
	
	public static double toMg(double kilo) {
		return kilo*Math.pow(10, 6);
	}
	
	public static double toTonne(double kilo) {
		return kilo*Math.pow(10, -3);
	}
}

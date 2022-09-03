package unitsOfMeasurement;

public class Mg {
	
	public static double toGram(double mg) {
		return mg/1000;
	}
	
	public static double toKilo(double mg) {
		return mg*Math.pow(10, -6);
	}
	
	public static double toTonne(double mg) {
		return mg/Math.pow(10, 9);
	}
}

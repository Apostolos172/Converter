package unitsOfMeasurement;

public class Gram {

	public static double toMg(double gram) {
		return gram*1000;
	}
	
	public static double toKilo(double gram) {
		return gram/1000;
	}
	
	public static double toTonne(double gram) {
		return gram*Math.pow(10, -6);
	}
}

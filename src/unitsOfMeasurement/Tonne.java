package unitsOfMeasurement;

public class Tonne {
	
	public static double toKilo(double tonne) {
		return tonne*1000;
	}
	
	public static double toGram(double tonne) {
		return tonne*Math.pow(10, 6);
	}
	
	public static double toMg(double tonne) {
		return tonne*Math.pow(10, 9);
	}
}

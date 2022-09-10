package unitsOfMeasurement.square;

public class Stremma {

	public Stremma() {
		// TODO Auto-generated constructor stub
	}
	
	public static double toSquareKiloMeter(double stremma) {
		return stremma/1000;
	}
	
	public static double toSquareMeter(double stremma) {
		return stremma*1000;
	}

	public static double toSquareDeciMeter(double stremma) {
		return stremma*Math.pow(10, 5);
	}
	
	public static double toSquareCentiMeter(double stremma) {
		return stremma*Math.pow(10, 7);
	}
	
	public static double toSquareMilliMeter(double stremma) {
		return stremma*Math.pow(10, 9);
	}
}

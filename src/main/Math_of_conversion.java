package main;

public class Math_of_conversion {

	public static double machTokmPerHour(double mach)
	{
		// Μαχ 1 είναι η ταχύτητα με αριθμητική τιμή 1.225 χλμ/ώρα
		
		double kmPerHour;
		kmPerHour = mach*1225.0;
		kmPerHour = Math_of_general_use.keep2decimals(kmPerHour);
		return kmPerHour;
	}
	
	public static double kmPerHourToMach(double kmPerHour)
	{
		// Μαχ 1 είναι η ταχύτητα με αριθμητική τιμή 1.225 χλμ/ώρα
		
		double mach;
		mach = kmPerHour/1225.0;
		mach = Math_of_general_use.keep2decimals(mach);
		return mach;
	}
	
	public static double kmtom(double km)
	{
		double m;
		m = 1000.0*km;
		m = Math_of_general_use.keep1decimal(m);
		return m;
	}
	
	public static double kmtodm(double km)
	{
		double dm;
		dm = 1000.0*km*10;
		dm = Math_of_general_use.keep1decimal(dm);
		return dm;
	}
	
	public static double kmtocm(double km)
	{
		double cm;
		cm = 1000.0*km*100;
		cm = Math_of_general_use.keep1decimal(cm);
		return cm;
	}
	
	public static double kmtomm(double km)
	{
		double mm;
		mm = 1000.0*km*1000;
		mm = Math_of_general_use.keep1decimal(mm);
		return mm;
	}
	
	public static double mtokm(double m)
	{
		double km;
		km = m/1000.0;
		km = Math_of_general_use.keep1decimal(km);
		return km;
	}
	
	public static double mtodm(double m)
	{
		double dm;
		dm = m*10.0;
		dm = Math_of_general_use.keep1decimal(dm);
		return dm;
	}
	
	public static double mtocm(double m)
	{
		double cm;
		cm = m*100.0;
		cm = Math_of_general_use.keep1decimal(cm);
		return cm;
	}
	
	public static double mtomm(double m)
	{
		double mm;
		mm = m*1000.0;
		mm = Math_of_general_use.keep1decimal(mm);
		return mm;
	}
}

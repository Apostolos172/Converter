package main;

public class Math_of_general_use {

	public static double keep1decimal(double x)
	{
		return Math.round(x * 10.0) / 10.0;
	}
	
	public static double keep2decimals(double x)
	{
		return Math.round(x * 100.0) / 100.0;
	}
	
	public static double keep3decimals(double x)
	{
		return Math.round(x * 1000.0) / 1000.0;
	}
	
}

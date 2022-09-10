package checking;

import unitsOfMeasurement.Gram;
import unitsOfMeasurement.Kilo;
import unitsOfMeasurement.Mg;
import unitsOfMeasurement.Tonne;
import unitsOfMeasurement.square.SquareCentiMeter;
import unitsOfMeasurement.square.SquareDeciMeter;
import unitsOfMeasurement.square.SquareKilometer;
import unitsOfMeasurement.square.SquareMeter;
import unitsOfMeasurement.square.SquareMilliMeter;
import unitsOfMeasurement.square.Stremma;

public class Surface implements UnitForChecking {

	public Surface() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isIt(String convertionSign, double measurementToConvert, StringBuilder toFieldText) {
		// TODO Auto-generated method stub
		
		switch(convertionSign) {
		
		//squareMeters_To_
		case "squareMeters_To_squareKiloMeters":
			toFieldText.append(Double.toString(SquareMeter.toSquareKiloMeter(measurementToConvert)));
			return true;
		case "squareMeters_To_Stremma":
			toFieldText.append(Double.toString(SquareMeter.toStremma(measurementToConvert)));
			return true;
		case "squareMeters_To_squareDeciMeters":
			toFieldText.append(Double.toString(SquareMeter.toSquareDeciMeter(measurementToConvert)));
			return true;
		case "squareMeters_To_squareCentiMeters":
			toFieldText.append(Double.toString(SquareMeter.toSquareCentiMeter(measurementToConvert)));
			return true;
		case "squareMeters_To_squareMilliMeters":
			toFieldText.append(Double.toString(SquareMeter.toSquareMilliMeter(measurementToConvert)));
			return true;
			
		//squareKiloMeters_To_
		case "squareKiloMeters_To_squareMeters":
			toFieldText.append(Double.toString(SquareKilometer.toSquareMeter(measurementToConvert)));
			return true;
		case "squareKiloMeters_To_Stremma":
			toFieldText.append(Double.toString(SquareKilometer.toStremma(measurementToConvert)));
			return true;
		case "squareKiloMeters_To_squareDeciMeters":
			toFieldText.append(Double.toString(SquareKilometer.toSquareDeciMeter(measurementToConvert)));
			return true;
		case "squareKiloMeters_To_squareCentiMeters":
			toFieldText.append(Double.toString(SquareKilometer.toSquareCentiMeter(measurementToConvert)));
			return true;
		case "squareKiloMeters_To_squareMilliMeters":
			toFieldText.append(Double.toString(SquareKilometer.toSquareMilliMeter(measurementToConvert)));
			return true;
		
		//Stremma_To_
		case "stremma_To_squareKiloMeters":
			toFieldText.append(Double.toString(Stremma.toSquareKiloMeter(measurementToConvert)));
			return true;
		case "stremma_To_squareMeters":
			toFieldText.append(Double.toString(Stremma.toSquareMeter(measurementToConvert)));
			return true;
		case "stremma_To_squareDeciMeters":
			toFieldText.append(Double.toString(Stremma.toSquareDeciMeter(measurementToConvert)));
			return true;
		case "stremma_To_squareCentiMeters":
			toFieldText.append(Double.toString(Stremma.toSquareCentiMeter(measurementToConvert)));
			return true;
		case "stremma_To_squareMilliMeters":
			toFieldText.append(Double.toString(Stremma.toSquareMilliMeter(measurementToConvert)));
			return true;
		
		//squareDeciMeters_To_
		case "squareDeciMeters_To_squareKiloMeters":
			toFieldText.append(Double.toString(SquareDeciMeter.toSquareKiloMeter(measurementToConvert)));
			return true;
		case "squareDeciMeters_To_squareMeters":
			toFieldText.append(Double.toString(SquareDeciMeter.toSquareMeter(measurementToConvert)));
			return true;
		case "squareDeciMeters_To_stremma":
			toFieldText.append(Double.toString(SquareDeciMeter.toStremma(measurementToConvert)));
			return true;
		case "squareDeciMeters_To_squareCentiMeters":
			toFieldText.append(Double.toString(SquareDeciMeter.toSquareCentiMeter(measurementToConvert)));
			return true;
		case "squareDeciMeters_To_squareMilliMeters":
			toFieldText.append(Double.toString(SquareDeciMeter.toSquareMilliMeter(measurementToConvert)));
			return true;			
		
		//squareCentiMeters_To_
		case "squareCentiMeters_To_squareKiloMeters":
			toFieldText.append(Double.toString(SquareCentiMeter.toSquareKiloMeters(measurementToConvert)));
			return true;
		case "squareCentiMeters_To_squareMeters":
			toFieldText.append(Double.toString(SquareCentiMeter.toSquareMeters(measurementToConvert)));
			return true;
		case "squareCentiMeters_To_stremma":
			toFieldText.append(Double.toString(SquareCentiMeter.toStremma(measurementToConvert)));
			return true;
		case "squareCentiMeters_To_squareDeciMeters":
			toFieldText.append(Double.toString(SquareCentiMeter.toSquareDeciMeters(measurementToConvert)));
			return true;
		case "squareCentiMeters_To_squareMilliMeters":
			toFieldText.append(Double.toString(SquareCentiMeter.toSquareMilliMeters(measurementToConvert)));
			return true;	
		
		//squareMilliMeters_To_
		case "squareMilliMeters_To_squareKiloMeters":
			toFieldText.append(Double.toString(SquareMilliMeter.toSquareKiloMeter(measurementToConvert)));
			return true;
		case "squareMilliMeters_To_squareMeters":
			toFieldText.append(Double.toString(SquareMilliMeter.toSquareMeter(measurementToConvert)));
			return true;
		case "squareMilliMeters_To_stremma":
			toFieldText.append(Double.toString(SquareMilliMeter.toStremma(measurementToConvert)));
			return true;
		case "squareMilliMeters_To_squareDeciMeters":
			toFieldText.append(Double.toString(SquareMilliMeter.toSquareDeciMeter(measurementToConvert)));
			return true;
		case "squareMilliMeters_To_squareCentiMeters":
			toFieldText.append(Double.toString(SquareMilliMeter.toSquareCentiMeter(measurementToConvert)));
			return true;	
			
		default:
			return false;
	}
	

	}

}

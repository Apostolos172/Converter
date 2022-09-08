package checking;

import unitsOfMeasurement.Gram;
import unitsOfMeasurement.Kilo;
import unitsOfMeasurement.Mg;
import unitsOfMeasurement.Tonne;

public class Mass implements UnitForChecking {

	public Mass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isIt(String convertionSign, double measurementToConvert, StringBuilder toFieldText) {
		// TODO Auto-generated method stub
		
		switch(convertionSign) {
		
		case "kilos_To_Tonne":
			toFieldText.append(Double.toString(Kilo.toTonne(measurementToConvert)));
			return true;
		case "kilos_To_Gram":
			toFieldText.append(Double.toString(Kilo.toGram(measurementToConvert)));
			return true;
		case "kilos_To_Mg":
			toFieldText.append(Double.toString(Kilo.toMg(measurementToConvert)));
			return true;
		case "mg_To_Kilos":
			toFieldText.append(Double.toString(Mg.toKilo(measurementToConvert)));
			return true;
		case "mg_To_Gram":
			toFieldText.append(Double.toString(Mg.toGram(measurementToConvert)));
			return true;
		case "mg_To_Tonne":
			toFieldText.append(Double.toString(Mg.toTonne(measurementToConvert)));
			return true;
		case "gram_To_Tonne":
			toFieldText.append(Double.toString(Gram.toTonne(measurementToConvert)));
			return true;
		case "gram_To_Kilo":
			toFieldText.append(Double.toString(Gram.toKilo(measurementToConvert)));
			return true;
		case "gram_To_Mg":
			toFieldText.append(Double.toString(Gram.toMg(measurementToConvert)));
			return true;
		case "tonne_To_Gram":
			toFieldText.append(Double.toString(Tonne.toGram(measurementToConvert)));
			return true;
		case "tonne_To_Kilo":
			toFieldText.append(Double.toString(Tonne.toKilo(measurementToConvert)));
			return true;
		case "tonne_To_Mg":
			toFieldText.append(Double.toString(Tonne.toMg(measurementToConvert)));
			return true;
		default:
			return false;
	}
	

	}

}

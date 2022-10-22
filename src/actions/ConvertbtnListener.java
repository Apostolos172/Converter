package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import checking.Mass;
import checking.Surface;
import unitsOfMeasurement.CentiMeter;
import unitsOfMeasurement.CubicCentiMeter;
import unitsOfMeasurement.CubicDeciMeter;
import unitsOfMeasurement.CubicMeter;
import unitsOfMeasurement.CubicMilliMeter;
import unitsOfMeasurement.DeciMeter;
import unitsOfMeasurement.KiloMeter;
import unitsOfMeasurement.Meter;
import unitsOfMeasurement.MilliMeter;

public class ConvertbtnListener implements ActionListener {
	private String convertionSign;
	private JTextField fromField, toField;
	private String toFieldText;
	private StringBuilder toFieldTextObject;

	public ConvertbtnListener(JTextField fromField, JTextField toField, String convertionSign) {
		super();
		this.convertionSign = convertionSign;
		this.fromField = fromField;
		this.toField = toField;
		this.toFieldTextObject = new StringBuilder("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculateAndDisplayResult();
		
		
		/*
		String toFieldText = "";
		switch(this.convertionSign) {
		
			// mass screen
			case "kilos_To_Tonne":
				toFieldText = Double.toString(Kilo.toTonne(measurementToConvert));
				break;
			case "kilos_To_Gram":
				toFieldText = Double.toString(Kilo.toGram(measurementToConvert));
				break;
			case "kilos_To_Mg":
				toFieldText = Double.toString(Kilo.toMg(measurementToConvert));
				break;
			case "mg_To_Kilos":
				toFieldText = Double.toString(Mg.toKilo(measurementToConvert));
				break;
			case "mg_To_Gram":
				toFieldText = Double.toString(Mg.toGram(measurementToConvert));
				break;
			case "mg_To_Tonne":
				toFieldText = Double.toString(Mg.toTonne(measurementToConvert));
				break;
			case "gram_To_Tonne":
				toFieldText = Double.toString(Gram.toTonne(measurementToConvert));
				break;
			case "gram_To_Kilo":
				toFieldText = Double.toString(Gram.toKilo(measurementToConvert));
				break;
			case "gram_To_Mg":
				toFieldText = Double.toString(Gram.toMg(measurementToConvert));
				break;
			case "tonne_To_Gram":
				toFieldText = Double.toString(Tonne.toGram(measurementToConvert));
				break;
			case "tonne_To_Kilo":
				toFieldText = Double.toString(Tonne.toKilo(measurementToConvert));
				break;
			case "tonne_To_Mg":
				toFieldText = Double.toString(Tonne.toMg(measurementToConvert));
				break;
				
			// volume screen
			case "cubicMeters_To_cubicDeciMeters":
				toFieldText = Double.toString(CubicMeter.toCubicDeciMeter(measurementToConvert));
				break;
			case "cubicMeters_To_cubicCentiMeters":
				toFieldText = Double.toString(CubicMeter.toCubicCentiMeter(measurementToConvert));
				break;
			case "cubicMeters_To_cubicMilliMeters":
				toFieldText = Double.toString(CubicMeter.toCubicCentiMeter(measurementToConvert));
				break;
			case "cubicDeciMeters_To_cubicMeters":
				toFieldText = Double.toString(CubicDeciMeter.toCubicMeter(measurementToConvert));
				break;
			case "cubicDeciMeters_To_cubicCentiMeters":
				toFieldText = Double.toString(CubicDeciMeter.toCubicCentiMeter(measurementToConvert));
				break;
			case "cubicDeciMeters_To_cubicMilliMeters":
				toFieldText = Double.toString(CubicDeciMeter.toCubicMilliMeter(measurementToConvert));
				break;
			case "cubicCentiMeters_To_cubicMeters":
				toFieldText = Double.toString(CubicCentiMeter.toCubicMeter(measurementToConvert));
				break;
			case "cubicCentiMeters_To_cubicDeciMeters":
				toFieldText = Double.toString(CubicCentiMeter.toCubicDeciMeter(measurementToConvert));
				break;
			case "cubicCentiMeters_To_cubicMilliMeters":
				toFieldText = Double.toString(CubicCentiMeter.toCubicMilliMeter(measurementToConvert));
				break;
			case "cubicMilliMeters_To_cubicMeters":
				toFieldText = Double.toString(CubicMilliMeter.toCubicMeter(measurementToConvert));
				break;
			case "cubicMilliMeters_To_cubicDeciMeters":
				toFieldText = Double.toString(CubicMilliMeter.toCubicDeciMeter(measurementToConvert));
				break;
			case "cubicMilliMeters_To_cubicCentiMeters":
				toFieldText = Double.toString(CubicMilliMeter.toCubicCentiMeter(measurementToConvert));
				break;
				
			// length screen
			case "Meters_To_kiloMeters":
				toFieldText = Double.toString(Meter.toKilometers(measurementToConvert));
				break;
			case "Meters_To_DeciMeters":
				toFieldText = Double.toString(Meter.toDeciMeters(measurementToConvert));
				break;
			case "Meters_To_CentiMeters":
				toFieldText = Double.toString(Meter.toCentiMeters(measurementToConvert));
				break;
			case "Meters_To_MilliMeters":
				toFieldText = Double.toString(Meter.toMilliMeters(measurementToConvert));
				break;
				
			case "KiloMeters_To_Meters":
				toFieldText = Double.toString(KiloMeter.toMeter(measurementToConvert));
				break;
			case "KiloMeters_To_DeciMeters":
				toFieldText = Double.toString(KiloMeter.toDeciMeter(measurementToConvert));
				break;
			case "KiloMeters_To_CentiMeters":
				toFieldText = Double.toString(KiloMeter.toCentiMeter(measurementToConvert));
				break;
			case "KiloMeters_To_MilliMeters":
				toFieldText = Double.toString(KiloMeter.toMilliMeter(measurementToConvert));
				break;
				
			case "DeciMeters_To_Meters":
				toFieldText = Double.toString(DeciMeter.toMeters(measurementToConvert));
				break;
			case "DeciMeters_To_KiloMeters":
				toFieldText = Double.toString(DeciMeter.toKiloMeters(measurementToConvert));
				break;
			case "DeciMeters_To_CentiMeters":
				toFieldText = Double.toString(DeciMeter.toCentiMeters(measurementToConvert));
				break;
			case "DeciMeters_To_MilliMeters":
				toFieldText = Double.toString(DeciMeter.toMilliMeters(measurementToConvert));
				break;
			
			case "CentiMeters_To_Meters":
				toFieldText = Double.toString(CentiMeter.toMeters(measurementToConvert));
				break;
			case "CentiMeters_To_KiloMeters":
				toFieldText = Double.toString(CentiMeter.toKiloMeters(measurementToConvert));
				break;
			case "CentiMeters_To_DeciMeters":
				toFieldText = Double.toString(CentiMeter.toDeciMeters(measurementToConvert));
				break;
			case "CentiMeters_To_MilliMeters":
				toFieldText = Double.toString(CentiMeter.toMilliMeters(measurementToConvert));
				break;
				
			case "MilliMeters_To_Meters":
				toFieldText = Double.toString(MilliMeter.toMeter(measurementToConvert));
				break;
			case "MilliMeters_To_KiloMeters":
				toFieldText = Double.toString(MilliMeter.toKiloMeter(measurementToConvert));
				break;
			case "MilliMeters_To_CentiMeters":
				toFieldText = Double.toString(MilliMeter.toCentiMeter(measurementToConvert));
				break;
			case "MilliMeters_To_DeciMeters":
				toFieldText = Double.toString(MilliMeter.toDeciMeter(measurementToConvert));
				break;
				
			default:
				toFieldText = this.fromField.getText();
		}
		this.toField.setText(toFieldText);
		*/
	}

	public void calculateAndDisplayResult() {
		double measurementToConvert = 0;
		try {
			measurementToConvert = Double.parseDouble(this.fromField.getText());
		} catch (Exception exc) {
			System.out.println("String inserted");
		}
		
		if(checkForMass(measurementToConvert)) {
			
		} else if (checkForVolume(measurementToConvert)) {
			
		} else if (checkForLength(measurementToConvert)) {
			
		} else if (checkForSurface(measurementToConvert)) {
			
		} else {
			this.toFieldText = this.fromField.getText();
		}
				
		//if(this.toFieldTextObject!=null)
		if(!(this.toFieldTextObject.toString().equals(""))) {
			this.toField.setText(this.toFieldTextObject.toString());
			// this.toFieldTextObject.delete(0, toFieldTextObject.length());
			//System.out.println("if(this.toFieldTextObject.toString()!=\"\")");
		}
		else
		//if(this.toField.getText()!="")
		{
			this.toField.setText(this.toFieldText);
			//System.out.println("else");
		}
		
	}

	private boolean checkForSurface(double measurementToConvert) {
		return new Surface().isIt(convertionSign, measurementToConvert, toFieldTextObject);
	}

	private boolean checkForLength(double measurementToConvert) {
		// length screen
		switch(this.convertionSign) {
			case "Meters_To_kiloMeters":
				toFieldText = Double.toString(Meter.toKilometers(measurementToConvert));
				return true;
			case "Meters_To_DeciMeters":
				toFieldText = Double.toString(Meter.toDeciMeters(measurementToConvert));
				return true;
			case "Meters_To_CentiMeters":
				toFieldText = Double.toString(Meter.toCentiMeters(measurementToConvert));
				return true;
			case "Meters_To_MilliMeters":
				toFieldText = Double.toString(Meter.toMilliMeters(measurementToConvert));
				return true;
				
			case "KiloMeters_To_Meters":
				toFieldText = Double.toString(KiloMeter.toMeter(measurementToConvert));
				return true;
			case "KiloMeters_To_DeciMeters":
				toFieldText = Double.toString(KiloMeter.toDeciMeter(measurementToConvert));
				return true;
			case "KiloMeters_To_CentiMeters":
				toFieldText = Double.toString(KiloMeter.toCentiMeter(measurementToConvert));
				return true;
			case "KiloMeters_To_MilliMeters":
				toFieldText = Double.toString(KiloMeter.toMilliMeter(measurementToConvert));
				return true;
				
			case "DeciMeters_To_Meters":
				toFieldText = Double.toString(DeciMeter.toMeters(measurementToConvert));
				return true;
			case "DeciMeters_To_KiloMeters":
				toFieldText = Double.toString(DeciMeter.toKiloMeters(measurementToConvert));
				return true;
			case "DeciMeters_To_CentiMeters":
				toFieldText = Double.toString(DeciMeter.toCentiMeters(measurementToConvert));
				return true;
			case "DeciMeters_To_MilliMeters":
				toFieldText = Double.toString(DeciMeter.toMilliMeters(measurementToConvert));
				return true;
			
			case "CentiMeters_To_Meters":
				toFieldText = Double.toString(CentiMeter.toMeters(measurementToConvert));
				return true;
			case "CentiMeters_To_KiloMeters":
				toFieldText = Double.toString(CentiMeter.toKiloMeters(measurementToConvert));
				return true;
			case "CentiMeters_To_DeciMeters":
				toFieldText = Double.toString(CentiMeter.toDeciMeters(measurementToConvert));
				return true;
			case "CentiMeters_To_MilliMeters":
				toFieldText = Double.toString(CentiMeter.toMilliMeters(measurementToConvert));
				return true;
				
			case "MilliMeters_To_Meters":
				toFieldText = Double.toString(MilliMeter.toMeter(measurementToConvert));
				return true;
			case "MilliMeters_To_KiloMeters":
				toFieldText = Double.toString(MilliMeter.toKiloMeter(measurementToConvert));
				return true;
			case "MilliMeters_To_CentiMeters":
				toFieldText = Double.toString(MilliMeter.toCentiMeter(measurementToConvert));
				return true;
			case "MilliMeters_To_DeciMeters":
				toFieldText = Double.toString(MilliMeter.toDeciMeter(measurementToConvert));
				return true;
			default:
				return false;
		}
	}

	private boolean checkForVolume(double measurementToConvert) {
		// volume screen
		switch(this.convertionSign) {
			case "cubicMeters_To_cubicDeciMeters":
				toFieldText = Double.toString(CubicMeter.toCubicDeciMeter(measurementToConvert));
				return true;
			case "cubicMeters_To_cubicCentiMeters":
				toFieldText = Double.toString(CubicMeter.toCubicCentiMeter(measurementToConvert));
				return true;
			case "cubicMeters_To_cubicMilliMeters":
				toFieldText = Double.toString(CubicMeter.toCubicCentiMeter(measurementToConvert));
				return true;
			case "cubicDeciMeters_To_cubicMeters":
				toFieldText = Double.toString(CubicDeciMeter.toCubicMeter(measurementToConvert));
				return true;
			case "cubicDeciMeters_To_cubicCentiMeters":
				toFieldText = Double.toString(CubicDeciMeter.toCubicCentiMeter(measurementToConvert));
				return true;
			case "cubicDeciMeters_To_cubicMilliMeters":
				toFieldText = Double.toString(CubicDeciMeter.toCubicMilliMeter(measurementToConvert));
				return true;
			case "cubicCentiMeters_To_cubicMeters":
				toFieldText = Double.toString(CubicCentiMeter.toCubicMeter(measurementToConvert));
				return true;
			case "cubicCentiMeters_To_cubicDeciMeters":
				toFieldText = Double.toString(CubicCentiMeter.toCubicDeciMeter(measurementToConvert));
				return true;
			case "cubicCentiMeters_To_cubicMilliMeters":
				toFieldText = Double.toString(CubicCentiMeter.toCubicMilliMeter(measurementToConvert));
				return true;
			case "cubicMilliMeters_To_cubicMeters":
				toFieldText = Double.toString(CubicMilliMeter.toCubicMeter(measurementToConvert));
				return true;
			case "cubicMilliMeters_To_cubicDeciMeters":
				toFieldText = Double.toString(CubicMilliMeter.toCubicDeciMeter(measurementToConvert));
				return true;
			case "cubicMilliMeters_To_cubicCentiMeters":
				toFieldText = Double.toString(CubicMilliMeter.toCubicCentiMeter(measurementToConvert));
				return true;
			default:
				return false;
		}
	}

	private boolean checkForMass(double measurementToConvert) {
		/*
		 * returns true if it is here so in the main method do break with if
		 * to separate logic of big switch above
		 */
		
		return new Mass().isIt(this.convertionSign, measurementToConvert, this.toFieldTextObject);
		// mass screen
		/*
		switch(this.convertionSign) {
				
			case "kilos_To_Tonne":
				toFieldText = Double.toString(Kilo.toTonne(measurementToConvert));
				return true;
			case "kilos_To_Gram":
				toFieldText = Double.toString(Kilo.toGram(measurementToConvert));
				return true;
			case "kilos_To_Mg":
				toFieldText = Double.toString(Kilo.toMg(measurementToConvert));
				return true;
			case "mg_To_Kilos":
				toFieldText = Double.toString(Mg.toKilo(measurementToConvert));
				return true;
			case "mg_To_Gram":
				toFieldText = Double.toString(Mg.toGram(measurementToConvert));
				return true;
			case "mg_To_Tonne":
				toFieldText = Double.toString(Mg.toTonne(measurementToConvert));
				return true;
			case "gram_To_Tonne":
				toFieldText = Double.toString(Gram.toTonne(measurementToConvert));
				return true;
			case "gram_To_Kilo":
				toFieldText = Double.toString(Gram.toKilo(measurementToConvert));
				return true;
			case "gram_To_Mg":
				toFieldText = Double.toString(Gram.toMg(measurementToConvert));
				return true;
			case "tonne_To_Gram":
				toFieldText = Double.toString(Tonne.toGram(measurementToConvert));
				return true;
			case "tonne_To_Kilo":
				toFieldText = Double.toString(Tonne.toKilo(measurementToConvert));
				return true;
			case "tonne_To_Mg":
				toFieldText = Double.toString(Tonne.toMg(measurementToConvert));
				return true;
			default:
				return false;
		}
		*/
		
	}

}

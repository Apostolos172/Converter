package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import unitsOfMeasurement.CubicCentiMeter;
import unitsOfMeasurement.CubicDeciMeter;
import unitsOfMeasurement.CubicMeter;
import unitsOfMeasurement.CubicMilliMeter;
import unitsOfMeasurement.Gram;
import unitsOfMeasurement.Kilo;
import unitsOfMeasurement.Mg;
import unitsOfMeasurement.Tonne;

public class ConvertbtnListener implements ActionListener {
	private String convertionSign;
	private JTextField fromField, toField;

	public ConvertbtnListener(JTextField fromField, JTextField toField, String convertionSign) {
		super();
		this.convertionSign = convertionSign;
		this.fromField = fromField;
		this.toField = toField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double measurementToConvert = Double.parseDouble(this.fromField.getText());
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
				
			default:
				toFieldText = this.fromField.getText();
		}
		this.toField.setText(toFieldText);
	}

}

package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

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
			default:
				toFieldText = this.fromField.getText();
		}
		this.toField.setText(toFieldText);
	}

}

package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import main.Math_of_conversion;

public class ConvertOneValueToOther implements ActionListener {

	private JTextField originalValueField;
	private JTextComponent convertedValueField;
	private String method;

	public ConvertOneValueToOther(JTextField originalValueField, JTextField convertedValueField, String method) {
		// TODO Auto-generated constructor stub
		this.originalValueField = originalValueField;
		this.convertedValueField = convertedValueField;
		this.method = method;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double originalNumber = Double.parseDouble(originalValueField.getText());

		switch(this.method) {
		  case "kmPerHourToMach":
			  convertedValueField.setText("" + Math_of_conversion.kmPerHourToMach(originalNumber));
			  break;
		  case "machTokmPerHour":
			  convertedValueField.setText("" + Math_of_conversion.machTokmPerHour(originalNumber));
			  break;
		  default:
			  convertedValueField.setText("Undefined");
		}
	
	}

}

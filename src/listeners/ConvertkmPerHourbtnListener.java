package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import main.Math_of_conversion;

public class ConvertkmPerHourbtnListener implements ActionListener {

	private JTextField kmPerHourtxt;
	private JTextComponent resultHavingkmPerHourtxt;

	public ConvertkmPerHourbtnListener(JTextField kmPerHourtxt, JTextField resultHavingkmPerHourtxt) {
		// TODO Auto-generated constructor stub
		this.kmPerHourtxt = kmPerHourtxt;
		this.resultHavingkmPerHourtxt = resultHavingkmPerHourtxt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double kmPerHour = Double.parseDouble(kmPerHourtxt.getText());
		resultHavingkmPerHourtxt.setText("" + Math_of_conversion.kmPerHourToMach(kmPerHour));
	
	}

}

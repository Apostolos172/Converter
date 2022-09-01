package actions;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class FocusFieldListener implements FocusListener {
	private JTextField fieldToBeCleared;
	
	public FocusFieldListener(JTextField fieldToBeCleared) {
		super();
		// TODO Auto-generated constructor stub
		this.fieldToBeCleared = fieldToBeCleared;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		this.fieldToBeCleared.setText("");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

}

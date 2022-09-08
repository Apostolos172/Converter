package actions;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class KeyListenerTextField implements KeyListener {
	private JTextField fromField, toField;
	private String convertionSign;

	public KeyListenerTextField() {
		// TODO Auto-generated constructor stub
	}

	public KeyListenerTextField(JTextField fromField, JTextField toField, String convertionSign) {
		// TODO Auto-generated constructor stub
		this.convertionSign = convertionSign;
		this.fromField = fromField;
		this.toField = toField;
		// testing();
	}

	@SuppressWarnings("unused")
	private void testing() {
		System.out.println(this.getClass());
		System.out.println(this.convertionSign + " " + this.fromField.getText());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			ConvertbtnListener convertbtnLis = new ConvertbtnListener(fromField, toField, convertionSign);
			convertbtnLis.calculateAndDisplayResult();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

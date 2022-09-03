package components;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import actions.ConvertbtnListener;

@SuppressWarnings("serial")
public class Button extends JButton {

	public Button(String convertionSign, JTextField fromField, JTextField toField) {
		// TODO Auto-generated constructor stub
		Icon icon = new ImageIcon("images/arrow.png");
		this.setIcon(icon);
		this.setBackground(Color.orange);
		this.addActionListener(new ConvertbtnListener(fromField, toField, convertionSign));
		this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}

	public Button(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public Button(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public Button(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public Button(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}

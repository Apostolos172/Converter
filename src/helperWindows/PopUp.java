package helperWindows;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.GUI;

public class PopUp extends JFrame {
	// CAUTION
	// create this, to make surface works only and add this window to other convertions in order to make a first release

	private JPanel centralPanel;
	private String message;

	public PopUp() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public PopUp(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public PopUp(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		
	}
	
	public PopUp(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public PopUp(String title, String message) {
		super(title);
		this.message = message;
		loadContent();
	}

	private void loadContent() {
		// TODO Auto-generated method stub
		this.centralPanel = new JPanel();
		this.setSize(500, 200);
		this.setLocation(500, 50);
		this.centralPanel.setBackground(new Color(166, 68, 82));
		
		JLabel lbl = new JLabel(this.message);
		GUI.setPaddingAtJLabel(lbl);
		lbl.setForeground(Color.white);
		lbl.setFont(new Font("SansSerif", Font.PLAIN, 20));
		this.centralPanel.add(lbl);
		
		this.add(centralPanel);
		this.setVisible(true);
	}

}

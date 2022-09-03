package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.GUI;

@SuppressWarnings("serial")
public class Header extends JPanel {

	private JLabel headerLabel;

	public Header(String title) {
		// TODO Auto-generated constructor stub
		
		createHeader(title);
	}

	private void createHeader(String title) {
		
		this.setBackground(Color.yellow);
		GUI.setPadding(this);
		
		headerLabel = new JLabel(title);
		headerLabel.setFont(GUI.getFont("serifFontBig"));
		GUI.setPaddingAtJLabel(headerLabel);
		
		this.add(headerLabel);
	}

	public Header(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Header(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Header(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}

package components;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.GUI;

@SuppressWarnings("serial")
public class Footer extends JPanel {

	private JLabel footerLabel1;
	private JLabel footerLabel2;

	public Footer() {
		// TODO Auto-generated constructor stub
		
		createFooter();
	}

	private void createFooter() {
		GUI.setPadding(this);
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.setAlignmentY(CENTER_ALIGNMENT);
		this.setAlignmentX(CENTER_ALIGNMENT);
		
		this.footerLabel1 = new JLabel("Designed by Tolis' s group");
		this.footerLabel1.setFont(GUI.getFont("sansSerifFontSmall"));
		this.footerLabel2 = new JLabel("Copyright 2020-2022");
		this.footerLabel2.setFont(GUI.getFont("sansSerifFontSmall"));
		 
	    this.add(footerLabel1);
	    this.add(footerLabel2);
		
	    this.setBackground(Color.cyan);		
	}

	public Footer(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Footer(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Footer(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}

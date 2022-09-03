package converters;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.Row;
import components.Card;
import components.Footer;
import components.Header;
import main.GUI;

public class Volume extends JFrame{
	private JPanel mainPanel;
	private JPanel centralPanel, headerPanel, footerPanel;
	
	public Volume() throws HeadlessException {
		super();
		this.setTitle("Μετατροπέας μονάδων μέτρησης όγκου");
		createMainPanel();
	}
	
	private void createMainPanel() {
		mainPanel = new JPanel(new BorderLayout());
		makeCentralPanel();
		makeHeaderPanel();
		makeFooterPanel();
		
        GUI.setPadding(mainPanel);
		GUI.setSizeOfTheWindow(this);
		this.setContentPane(mainPanel);
		this.setVisible(true);
	}

	private void makeFooterPanel() {
		this.footerPanel = new Footer();
		mainPanel.add(this.footerPanel, BorderLayout.PAGE_END);
	}

	private void makeHeaderPanel() {
		this.headerPanel = new Header("Μετατροπέας μονάδων μέτρησης όγκου");
		this.mainPanel.add(headerPanel, BorderLayout.PAGE_START);
	}

	private void makeCentralPanel() {
		// TODO Auto-generated method stub
		this.centralPanel = new JPanel(new GridLayout(2,2,10,10));
		JPanel p1 = new Card("cubicMeters_To_cubicDeciMeters", "cubicMeters_To_cubicCentiMeters", "cubicMeters_To_cubicMilliMeters");
		JPanel p2 = new Card("cubicDeciMeters_To_cubicMeters", "cubicDeciMeters_To_cubicCentiMeters", "cubicDeciMeters_To_cubicMilliMeters");
		JPanel p3 = new Card("cubicCentiMeters_To_cubicMeters", "cubicCentiMeters_To_cubicDeciMeters", "cubicCentiMeters_To_cubicMilliMeters");
		JPanel p4 = new Card("cubicMilliMeters_To_cubicMeters", "cubicMilliMeters_To_cubicDeciMeters", "cubicMilliMeters_To_cubicCentiMeters");
		this.centralPanel.add(p1);
		this.centralPanel.add(p2);
		this.centralPanel.add(p3);
		this.centralPanel.add(p4);
		this.mainPanel.add(centralPanel);
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}
	
}

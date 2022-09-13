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
import util.Useful;

public class Surface extends JFrame{
	private JPanel mainPanel;
	private JPanel centralPanel, headerPanel, footerPanel;
	private String name = "Μετατροπέας μονάδων μέτρησης επιφάνειας";
	
	public Surface() throws HeadlessException {
		super();
		this.setTitle(name);
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
		this.headerPanel = new Header(name);
		this.mainPanel.add(headerPanel, BorderLayout.PAGE_START);
	}

	private void makeCentralPanel() {
		// TODO Auto-generated method stub
		this.centralPanel = new JPanel(new GridLayout(2,3,10,10));
		String[] ids1 = {"stremma_To_squareKiloMeters", "stremma_To_squareMeters", "stremma_To_squareDeciMeters", "stremma_To_squareCentiMeters", "stremma_To_squareMilliMeters"};
		JPanel p1 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids1), false);
		String[] ids2 = {"squareMeters_To_squareKiloMeters", "squareMeters_To_Stremma", "squareMeters_To_squareDeciMeters", "squareMeters_To_squareCentiMeters", "squareMeters_To_squareMilliMeters"};
		JPanel p2 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids2), false);
		String[] ids3 = {"squareKiloMeters_To_squareMeters", "squareKiloMeters_To_Stremma", "squareKiloMeters_To_squareDeciMeters", "squareKiloMeters_To_squareCentiMeters", "squareKiloMeters_To_squareMilliMeters"};
		JPanel p3 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids3), false);
		String[] ids4 = {"squareDeciMeters_To_squareKiloMeters", "squareDeciMeters_To_squareMeters", "squareDeciMeters_To_stremma", "squareDeciMeters_To_squareCentiMeters", "squareDeciMeters_To_squareMilliMeters"};
		JPanel p4 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids4), false);
		String[] ids5 = {"squareCentiMeters_To_squareKiloMeters", "squareCentiMeters_To_squareMeters", "squareCentiMeters_To_stremma", "squareCentiMeters_To_squareDeciMeters", "squareCentiMeters_To_squareMilliMeters"};
		JPanel p5 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids5), false);
		String[] ids6 = {"squareMilliMeters_To_squareKiloMeters", "squareMilliMeters_To_squareMeters", "squareMilliMeters_To_stremma", "squareMilliMeters_To_squareDeciMeters", "squareMilliMeters_To_squareCentiMeters"};
		JPanel p6 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids6), false);
		this.centralPanel.add(p1);
		this.centralPanel.add(p2);
		this.centralPanel.add(p3);
		this.centralPanel.add(p4);
		this.centralPanel.add(p5);
		this.centralPanel.add(p6);
		this.mainPanel.add(centralPanel);
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}
	
}

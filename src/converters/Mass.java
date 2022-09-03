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

public class Mass extends JFrame{
	private JPanel mainPanel;
	private JPanel centralPanel, headerPanel, footerPanel;
	
	public Mass() throws HeadlessException {
		super();
		this.setTitle("Μετατροπέας μονάδων μέτρησης μάζας");
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
		this.headerPanel = new Header("Μετατροπέας μονάδων μέτρησης μάζας");
		this.mainPanel.add(headerPanel, BorderLayout.PAGE_START);
	}

	private void makeCentralPanel() {
		// TODO Auto-generated method stub
		this.centralPanel = new JPanel(new GridLayout(2,2,10,10));
		JPanel p1 = new Card("kilos_To_Tonne", "kilos_To_Gram", "kilos_To_Mg");
		JPanel p2 = new Card("gram_To_Tonne", "gram_To_Kilo", "gram_To_Mg");
		JPanel p3 = new Card("tonne_To_Kilo", "tonne_To_Gram", "tonne_To_Mg");
		JPanel p4 = new Card("mg_To_Tonne", "mg_To_Kilos", "mg_To_Gram");
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

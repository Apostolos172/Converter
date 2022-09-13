package converters;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import components.Card;
import components.Footer;
import components.Header;
import main.*;
import util.Useful;

public class Length extends JFrame{
	
	private JPanel mainPanel, northPanel, centralPanel, southPanel;
	//northPanel
	private JLabel headerLabel;
	//centralPanel
	/*
	 * JPanel panelToAdd, String having, String to, 
	 * JTextField txtInitial, JLabel labelInitial, 
	 * JButton convertbtn,
	 * JTextField txtResult, JLabel labelResult 
	 */
	//private JPanel kmtoother;
	//private String havingkm, kmtom, kmtodm, kmtocm, kmtomm;
	private JLabel labelInitialkm, labelResultto;
	private JTextField txtInitialkm, txtResultkmtom, txtResultkmtodm, txtResultkmtocm, txtResultkmtomm;
	//private JButton convertbtn;
	
	private JPanel kmtoother, mtoother, dmtoother, cmtoother, mmtoother;
	//private String havingkm, kmtom, kmtodm, kmtocm, kmtomm;
	private JLabel labelInitial, labelResult;
	private JTextField txtInitial, txtResult;
	private JButton convertbtn;
	
	//southPanel
	private JLabel footerLabel1, footerLabel2;
	
	//centralPanel
	private JButton kmtom;
	private JButton kmtodm;
	private JButton kmtocm;
	private JButton kmtomm;
	private JButton mtokm;
	private JButton mtodm;
	private JButton mtocm;
	private JButton mtomm;
	private JButton dmtokm;
	private JButton dmtom;
	private JButton dmtocm;
	private JButton dmtomm;
	private JButton cmtokm;
	private JButton cmtom;
	private JButton cmtodm;
	private JButton cmtomm;
	private JButton mmtokm;
	private JButton mmtom;
	private JButton mmtodm;
	private JButton mmtocm;
	
	private JTextField mfromkm;
	private JTextField dmfromkm;
	private JTextField cmfromkm;
	private JTextField mmfromkm;
	private JTextField kmfromm;
	private JTextField dmfromm;
	private JTextField cmfromm;
	private JTextField mmfromm;
	
	private JTextField kmform;
	private JTextField kmfordm;
	private JTextField kmforcm;
	private JTextField kmformm;
	private JTextField mforkm;
	private JTextField mfordm;
	private JTextField mforcm;
	private JTextField mformm;
	
	public Length()
	{
		super("Μετατροπέας μονάδων μέτρησης μήκους");
		makeFrame();
	}
	
	public void makeFrame()
	{
		String routeforImages = "C:\\Users\\user\\eclipse-workspace\\Converter\\images\\converters\\mach";
		
		mainPanel = new JPanel(new BorderLayout());
		
		makeNorthPanel();
		makeCentralPanel();
		makeSouthPanel();
        
		this.setContentPane(mainPanel);
		
        GUI.setPadding(mainPanel);
		GUI.setSizeOfTheWindow(this);
		//this.setSize(2000, 1000);
        
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void makeNorthPanel()
	{
		northPanel = new Header("Μετατροπέας μονάδων μέτρησης μήκους");
		mainPanel.add(northPanel,BorderLayout.NORTH);
	}
	
	public void makeCentralPanel()
	{
		//centralPanel = new JPanel(new GridLayout(3,3,10,10));

		centralPanel = new JPanel(new GridLayout(2,1,10,10));
		GUI.setPadding(centralPanel);
		JPanel firstRowOfCards = new JPanel(new GridLayout(1,3));
		GUI.setPadding(firstRowOfCards);		
		String[] ids1 = {"Meters_To_kiloMeters", "Meters_To_DeciMeters", "Meters_To_CentiMeters", "Meters_To_MilliMeters"};
		JPanel CardPanel1 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids1));
		String[] ids2 = {"KiloMeters_To_Meters", "KiloMeters_To_DeciMeters", "KiloMeters_To_CentiMeters", "KiloMeters_To_MilliMeters"};
		JPanel CardPanel2 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids2));
		String[] ids3 = {"DeciMeters_To_Meters", "DeciMeters_To_KiloMeters", "DeciMeters_To_CentiMeters", "DeciMeters_To_MilliMeters"};
		JPanel CardPanel3 = new Card(Useful.createAndGetArrayListOfIdentifiersStrings(ids3));
		firstRowOfCards.add(CardPanel1);
		firstRowOfCards.add(CardPanel2);
		firstRowOfCards.add(CardPanel3);
		centralPanel.add(firstRowOfCards);
		
		JPanel secondRowOfCards = new JPanel(new GridLayout(1,2));
		GUI.setPadding(secondRowOfCards);
		// Change constructors in FUTURE
		JPanel CardPanel4 = new Card("CentiMeters_To_Meters","CentiMeters_To_KiloMeters","CentiMeters_To_DeciMeters","CentiMeters_To_MilliMeters");
		JPanel CardPanel5 = new Card("MilliMeters_To_Meters","MilliMeters_To_KiloMeters","MilliMeters_To_CentiMeters","MilliMeters_To_DeciMeters");
		secondRowOfCards.add(CardPanel4);
		secondRowOfCards.add(CardPanel5);
		centralPanel.add(secondRowOfCards);
			
		centralPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		mainPanel.add(centralPanel,BorderLayout.CENTER);
	}
	
	@SuppressWarnings("unused")
	private ArrayList<String> createAndGetArrayListOfIdentifiersStrings(String string, String string2, String string3,
			String string4) {
		// TODO Auto-generated method stub
		ArrayList<String> ids = null;
		ids = new ArrayList<String>();
		ids.add(string);
		ids.add(string2);
		ids.add(string3);
		ids.add(string4);
		return ids;
	}

	public void makeSouthPanel()
	{
		southPanel = new Footer();
        mainPanel.add(southPanel,BorderLayout.SOUTH);
	}
	
}

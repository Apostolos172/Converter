package converters;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import main.*;

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
		northPanel = new JPanel();
		northPanel.setBackground(Color.yellow);
		GUI.setPadding(northPanel);
		
		headerLabel = new JLabel("Μετατροπέας μονάδων μέτρησης μήκους");
		headerLabel.setFont(GUI.getFont("serifFontBig"));
		GUI.setPaddingAtJLabel(headerLabel);
		
		northPanel.add(headerLabel);
		
		mainPanel.add(northPanel,BorderLayout.NORTH);
	}
	
	public void makeCentralPanel()
	{
		centralPanel = new JPanel(new GridLayout(3,3,10,10));
		
		convertbtnListener convertbtnListener = new convertbtnListener();
		
		kmtoother = new JPanel(new GridLayout(4,5,3,3));
		
		kmtom = this.createkmtomConvertionRow();
		kmtodm = this.createkmtodmConvertionRow();
		kmtocm = this.createkmtocmConvertionRow();
		kmtomm = this.createkmtommConvertionRow();
		
		kmtom.addActionListener(convertbtnListener);
		kmtodm.addActionListener(convertbtnListener);
		kmtocm.addActionListener(convertbtnListener);
		kmtomm.addActionListener(convertbtnListener);
		
		kmtoother.setBackground(Color.yellow);
		GUI.setPadding(kmtoother);
		centralPanel.add(kmtoother);
		
		mtoother = new JPanel(new GridLayout(4,5,3,3));
		
		mtokm = this.createmtokmConvertionRow();
		mtodm = this.createmtodmConvertionRow();
		mtocm = this.createmtocmConvertionRow();
		mtomm = this.createmtommConvertionRow();
		
		mtokm.addActionListener(convertbtnListener);
		mtodm.addActionListener(convertbtnListener);
		mtocm.addActionListener(convertbtnListener);
		mtomm.addActionListener(convertbtnListener);
		
		mtoother.setBackground(Color.cyan);
		GUI.setPadding(mtoother);
		centralPanel.add(mtoother);
		
		dmtoother = new JPanel(new GridLayout(4,5,3,3));
		/*
		//dmtokm = this.createAConvertionRow(dmtoother, "dm", "km", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//dmtom = this.createAConvertionRow(dmtoother, "dm", "m", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//dmtocm = this.createAConvertionRow(dmtoother, "dm", "cm", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//dmtomm = this.createAConvertionRow(dmtoother, "dm", "mm", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		
		dmtokm.addActionListener(convertbtnListener);
		dmtom.addActionListener(convertbtnListener);
		dmtocm.addActionListener(convertbtnListener);
		dmtomm.addActionListener(convertbtnListener);
		
		dmtoother.setBackground(Color.pink);
		GUI.setPadding(dmtoother);
		centralPanel.add(dmtoother);
		
		cmtoother = new JPanel(new GridLayout(4,5,3,3));
		
		//cmtokm = this.createAConvertionRow(cmtoother, "cm", "km", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//cmtom = this.createAConvertionRow(cmtoother, "cm", "m", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//cmtodm = this.createAConvertionRow(cmtoother, "cm", "dm", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//cmtomm = this.createAConvertionRow(cmtoother, "cm", "mm", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		
		cmtokm.addActionListener(convertbtnListener);
		cmtom.addActionListener(convertbtnListener);
		cmtodm.addActionListener(convertbtnListener);
		cmtomm.addActionListener(convertbtnListener);
		
		cmtoother.setBackground(Color.gray);
		GUI.setPadding(cmtoother);
		centralPanel.add(cmtoother);
		
		mmtoother = new JPanel(new GridLayout(4,5,3,3));
		
		//mmtokm = this.createAConvertionRow(mmtoother, "mm", "km", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//mmtom = this.createAConvertionRow(mmtoother, "mm", "m", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//mmtodm = this.createAConvertionRow(mmtoother, "mm", "dm", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		//mmtocm = this.createAConvertionRow(mmtoother, "mm", "cm", txtInitial, labelInitial, convertbtn, txtResult, labelResult);
		
		mmtokm.addActionListener(convertbtnListener);
		mmtom.addActionListener(convertbtnListener);
		mmtodm.addActionListener(convertbtnListener);
		mmtocm.addActionListener(convertbtnListener);
		
		mmtoother.setBackground(Color.blue);
		GUI.setPadding(mmtoother);
		centralPanel.add(mmtoother);
		*/
		centralPanel.add(new JPanel());
		
		centralPanel.add(new JPanel());
		centralPanel.add(new JPanel());
		centralPanel.add(new JPanel());
			
		centralPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		mainPanel.add(centralPanel,BorderLayout.CENTER);
	}
	
	public JButton createkmtomConvertionRow()
	{
		
		kmform = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(kmform);
		kmform.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("km");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		mfromkm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(mfromkm);
		mfromkm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("m");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		kmtoother.add(kmform);
		kmtoother.add(labelInitial);
		kmtoother.add(convertbtn);
		kmtoother.add(mfromkm);
		kmtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createkmtodmConvertionRow()
	{
		
		kmfordm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(kmfordm);
		kmfordm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("km");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		dmfromkm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(dmfromkm);
		dmfromkm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("dm");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		kmtoother.add(kmfordm);
		kmtoother.add(labelInitial);
		kmtoother.add(convertbtn);
		kmtoother.add(dmfromkm);
		kmtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createkmtocmConvertionRow()
	{
		
		kmforcm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(kmforcm);
		kmforcm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("km");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		cmfromkm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(cmfromkm);
		cmfromkm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("cm");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		kmtoother.add(kmforcm);
		kmtoother.add(labelInitial);
		kmtoother.add(convertbtn);
		kmtoother.add(cmfromkm);
		kmtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createkmtommConvertionRow()
	{
		
		kmformm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(kmformm);
		kmformm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("km");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		mmfromkm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(mmfromkm);
		mmfromkm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("mm");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		kmtoother.add(kmformm);
		kmtoother.add(labelInitial);
		kmtoother.add(convertbtn);
		kmtoother.add(mmfromkm);
		kmtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createmtokmConvertionRow()
	{
		
		mforkm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(mforkm);
		mforkm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("m");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		kmfromm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(kmfromm);
		kmfromm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("km");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		mtoother.add(mforkm);
		mtoother.add(labelInitial);
		mtoother.add(convertbtn);
		mtoother.add(kmfromm);
		mtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createmtodmConvertionRow()
	{
		
		mfordm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(mfordm);
		mfordm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("m");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		dmfromm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(dmfromm);
		dmfromm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("dm");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		mtoother.add(mfordm);
		mtoother.add(labelInitial);
		mtoother.add(convertbtn);
		mtoother.add(dmfromm);
		mtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createmtocmConvertionRow()
	{
		
		mforcm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(mforcm);
		mforcm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("m");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		cmfromm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(cmfromm);
		cmfromm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("cm");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		mtoother.add(mforcm);
		mtoother.add(labelInitial);
		mtoother.add(convertbtn);
		mtoother.add(cmfromm);
		mtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public JButton createmtommConvertionRow()
	{
		
		mformm = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(mformm);
		mformm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelInitial = new JLabel("m");
		labelInitial.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertbtn = new JButton();
		convertbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		
		ImageIcon convert = new ImageIcon("images/arrow.png");
	    convertbtn.setIcon(convert);
		
		mmfromm = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(mmfromm);
		mmfromm.setFont(GUI.getFont("sansSerifFontMedium"));
		
		labelResult = new JLabel("mm");
		labelResult.setFont(GUI.getFont("sansSerifFontMedium"));
		
		mtoother.add(mformm);
		mtoother.add(labelInitial);
		mtoother.add(convertbtn);
		mtoother.add(mmfromm);
		mtoother.add(labelResult);
		
		return convertbtn;
	}
	
	public void makeSouthPanel()
	{
		southPanel = new JPanel();
		GUI.setPadding(southPanel);
		southPanel.setLayout(new BoxLayout(southPanel,BoxLayout.Y_AXIS));
		southPanel.setAlignmentY(CENTER_ALIGNMENT);
		southPanel.setAlignmentX(CENTER_ALIGNMENT);
		
		footerLabel1 = new JLabel("Designed by Tolis' s group");
		footerLabel1.setFont(GUI.getFont("sansSerifFontSmall"));
		footerLabel2 = new JLabel("Copyright 2020");
		footerLabel2.setFont(GUI.getFont("sansSerifFontSmall"));
		 
        southPanel.add(footerLabel1);
        southPanel.add(footerLabel2);
		
        southPanel.setBackground(Color.cyan);
        
        mainPanel.add(southPanel,BorderLayout.SOUTH);
	}
	
	class convertbtnListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {

			if(e.getSource()==kmtom)
				mfromkm.setText("" + Math_of_conversion.kmtom(Double.parseDouble(kmform.getText())));
			else if(e.getSource()==kmtodm)
				dmfromkm.setText("" + Math_of_conversion.kmtodm(Double.parseDouble(kmfordm.getText())));
			else if(e.getSource()==kmtocm)
				cmfromkm.setText("" + Math_of_conversion.kmtocm(Double.parseDouble(kmforcm.getText())));
			else if(e.getSource()==kmtomm)
				mmfromkm.setText("" + Math_of_conversion.kmtomm(Double.parseDouble(kmformm.getText())));
			else if(e.getSource()==mtokm)
				kmfromm.setText("" + Math_of_conversion.mtokm(Double.parseDouble(mforkm.getText())));
			else if(e.getSource()==mtodm)
				dmfromm.setText("" + Math_of_conversion.mtodm(Double.parseDouble(mfordm.getText())));
			else if(e.getSource()==mtocm)
				cmfromm.setText("" + Math_of_conversion.mtocm(Double.parseDouble(mforcm.getText())));
			else if(e.getSource()==mtomm)
				mmfromm.setText("" + Math_of_conversion.mtomm(Double.parseDouble(mformm.getText())));
			
		}
	}
	
}

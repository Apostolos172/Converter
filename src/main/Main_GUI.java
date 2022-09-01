package main;

import converters.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main_GUI extends JFrame{
	
	private JPanel mainPanel, northPanel, southPanel, centralPanel;
	//northPanel
	private ImageIcon image;
	private JLabel imageLabel;
	//centralPanel
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	//southPanel
	private JLabel footerLabel1, footerLabel2;
	
	public Main_GUI()
	{
		super("Μετατροπέας μονάδων μέτρησης");
		makeFrame();
	}
	
	public void makeFrame()
	{
		mainPanel = new JPanel(new BorderLayout());
		
		makeNorthPanel();
		makeCentralPanel();
		makeSouthPanel();
        
		this.setContentPane(mainPanel);
		
        GUI.setPadding(mainPanel);
		GUI.setSizeOfTheWindow(this);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void makeNorthPanel()
	{
		northPanel = new JPanel();
		GUI.setPadding(northPanel);
		
		image = new ImageIcon("images/general/title/converter.png");
        imageLabel = new JLabel(image);
        northPanel.add(imageLabel);
        
        northPanel.setBackground(Color.white);
        
        mainPanel.add(northPanel,BorderLayout.NORTH);
	}
	
	public void makeCentralPanel()
	{
		centralPanel = new JPanel(new GridLayout(3,4,5,5));
		centralPanel.setBackground(Color.white);
		GUI.setPadding(centralPanel);
		
	    /*
		Image img;
		try {
			img = ImageIO.read(getClass().getResource("airplaneIcon.bmp"));
			b1.setIcon(new ImageIcon(img));
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/ 
	    
	    b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		b12 = new JButton();
		
		ImageIcon mach = new ImageIcon("images/converters/mach/plane.png");
	    b1.setIcon(mach);
	    ImageIcon length = new ImageIcon("images/converters/length/length.png");
	    b2.setIcon(length);
	    ImageIcon area = new ImageIcon("images/converters/area/area.png");
	    b3.setIcon(area);
	    ImageIcon volume = new ImageIcon("images/converters/volume/volume.png");
	    b4.setIcon(volume);
	    ImageIcon mass = new ImageIcon("images/converters/mass/mass.png");
	    b5.setIcon(mass);
	    ImageIcon speed = new ImageIcon("images/converters/speed/speed.png");
	    b6.setIcon(speed);
		mach = new ImageIcon("images/converters/mach/airplaneIcon.png");
	    b7.setIcon(mach);
	    ImageIcon screw = new ImageIcon("images/converters/screw/screw.png");
	    b8.setIcon(screw);
	    ImageIcon field = new ImageIcon("images/converters/field/field.png");
	    b9.setIcon(field);
	    ImageIcon bytes = new ImageIcon("images/converters/byte/byte.png");
	    b10.setIcon(bytes);
	    ImageIcon car = new ImageIcon("images/converters/car/car.png");
	    b11.setIcon(car);
	    ImageIcon ok = new ImageIcon("images/converters/ok/ok.png");
	    b12.setIcon(ok);
	    
	    b1Listener b1listener = new b1Listener();
	    b1.addActionListener(b1listener);
	    b2Listener b2listener = new b2Listener();
	    b2.addActionListener(b2listener);
	    b3Listener b3listener = new b3Listener();
	    b3.addActionListener(b3listener);
	    b4Listener b4listener = new b4Listener();
	    b4.addActionListener(b4listener);
	    b5Listener b5listener = new b5Listener();
	    b5.addActionListener(b5listener);
	    b6Listener b6listener = new b6Listener();
	    b6.addActionListener(b6listener);
	    b7Listener b7listener = new b7Listener();
	    b7.addActionListener(b7listener);
	    b8Listener b8listener = new b8Listener();
	    b8.addActionListener(b8listener);
	    b9Listener b9listener = new b9Listener();
	    b9.addActionListener(b9listener);
	    b10Listener b10listener = new b10Listener();
	    b10.addActionListener(b10listener);
	    b11Listener b11listener = new b11Listener();
	    b11.addActionListener(b11listener);
	    b12Listener b12listener = new b12Listener();
	    b12.addActionListener(b12listener);
		
		centralPanel.add(b1);
		centralPanel.add(b2);
		centralPanel.add(b3);
		centralPanel.add(b4);
		centralPanel.add(b5);
		centralPanel.add(b6);
		centralPanel.add(b7);
		centralPanel.add(b8);
		centralPanel.add(b9);
		centralPanel.add(b10);
		centralPanel.add(b11);
		centralPanel.add(b12);
		
		mainPanel.add(centralPanel, BorderLayout.CENTER);
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
	
	class b1Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new Mach();
		}
	}
	
	class b2Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new Length();
		}
	}
	
	class b3Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b4Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b5Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new Mass();
		}
	}
	
	class b6Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b7Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b8Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b9Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b10Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b11Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	class b12Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
				
		}
	}
	
	
}

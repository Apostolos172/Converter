package main;

import converters.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import components.Button;
import components.Footer;
import components.Header;

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
		northPanel = new Header("images/general/title/converter.png", "image");
        mainPanel.add(northPanel,BorderLayout.NORTH);
	}
	
	public void makeCentralPanel()
	{
		centralPanel = new JPanel(new GridLayout(3,4,5,5));
		centralPanel.setBackground(Color.white);
		GUI.setPadding(centralPanel);
	    
	    b1 = new components.Button("Mach", "images/converters/mach/plane.png");
		b2 = new components.Button("Length", "images/converters/length/length.png");
		b3 = new components.Button("Area", "images/converters/area/area.png");
		b4 = new components.Button("Volume", "images/converters/volume/volume.png");
		b5 = new components.Button("Mass", "images/converters/mass/mass.png");
		b6 = new components.Button("Speed", "images/converters/speed/speed.png");
		b7 = new components.Button("Mach", "images/converters/mach/airplaneIcon.png");
		b8 = new components.Button("Screw", "images/converters/screw/screw.png");
		b9 = new components.Button("Field", "images/converters/field/field.png");
		b10 = new components.Button("Byte", "images/converters/byte/byte.png");
		b11 = new components.Button("Car", "images/converters/car/car.png");
		b12 = new components.Button("Ok", "images/converters/ok/ok.png");

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
		southPanel = new Footer();
        
        mainPanel.add(southPanel,BorderLayout.SOUTH);
	}
	
}

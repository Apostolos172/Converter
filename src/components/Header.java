package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.GUI;

@SuppressWarnings("serial")
public class Header extends JPanel {

	private JLabel headerLabel;
	
	public Header(String title) {
		routingConstruction(title, "text");
	}

	public Header(String title, String identifier) {
		// TODO Auto-generated constructor stub
		routingConstruction(title, identifier);
	}
	

	private void routingConstruction(String title, String identifier) {
		// TODO Auto-generated method stub
		switch(identifier) {
		  case "text":
			  createHeader(title);
			  break;
		  case "image":
			  createHeaderWithImage(title);
			  break;
		  default:
			  createHeader("");
		}
	}

	private void createHeader(String titleText) {
		
		this.setBackground(Color.yellow);
		GUI.setPadding(this);
		
		headerLabel = new JLabel(titleText);
		headerLabel.setFont(GUI.getFont("serifFontBig"));
		GUI.setPaddingAtJLabel(headerLabel);
		
		this.add(headerLabel);
	}
	
	public void createHeaderWithImage(String imageUri) {
		GUI.setPadding(this);
		
		ImageIcon image = new ImageIcon(imageUri);
        JLabel imageLabel = new JLabel(image);
        this.add(imageLabel);
        
        this.setBackground(Color.white);
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

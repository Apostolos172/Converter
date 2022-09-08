package components;

import java.awt.Color;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import main.GUI;
import properties.Colors;

@SuppressWarnings("serial")
public class Card extends JPanel {
	private Row r1, r2, r3, r4;

	public Card(String string, String string2, String string3) {
		customizeCard();
		// convertionSign == string
		createRows(string, string2, string3);
		// add in FUTURE them into an array and add eventListeners as members of the array
		addRowsToCard();
	}
	
	public Card(String string, String string2, String string3, String string4) {
		customizeCard();
		// convertionSign == string
		r1 = new Row(string);
		r2 = new Row(string2);
		r3 = new Row(string3);
		r4 = new Row(string4);
		// add in FUTURE them into an array and add eventListeners as members of the array
		this.add(r1);
		this.add(r2);
		this.add(r3);
		this.add(r4);
	}
	
	public Card(ArrayList<String> identifiers) {
		customizeCard();
		// convertionSign == string
		ArrayList<Row> rows = new ArrayList<Row>();
		for (String identifier : identifiers) { 		      
			rows.add(new Row(identifier));
	    }
		for (Row row : rows) { 		      
			this.add(row);
	    }
		// add in FUTURE them into an array and add eventListeners as members of the array

	}

	private void createRows(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		r1 = new Row(string);
		r2 = new Row(string2);
		r3 = new Row(string3);
	}

	private void addRowsToCard() {
		// TODO Auto-generated method stub
		this.add(r1);
		this.add(r2);
		this.add(r3);
	}

	private void customizeCard() {
		// TODO Auto-generated method stub
		// this.setBackground(Color.BLACK);
		this.setBackground(new Color(Colors.get("red")[0], Colors.get("red")[1], Colors.get("red")[2]));
		GUI.setPadding(this);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	}

	public Card(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Card(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Card(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}

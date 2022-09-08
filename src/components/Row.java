package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import actions.ConvertbtnListener;
import actions.FocusFieldListener;
import actions.KeyListenerTextField;
import main.GUI;

@SuppressWarnings("serial")
public class Row extends JPanel {
	
	private JLabel fromMeasurement,toMeasurement;
	private JTextField fromField, toField;
	private JButton btn;

	public Row(String convertionSign) {
		// TODO Auto-generated constructor stub		
		customizeRow();
		
		this.fromMeasurement = new JLabel();
		this.toMeasurement = new JLabel();
		if(convertionSign.contains("_To_")) {
			this.fromMeasurement.setText(getFromWhichUnitOfMeasurementWeConvert(convertionSign));
			this.toMeasurement.setText(getToWhichUnitOfMeasurementWeConvert(convertionSign));	
		}
		// testing(convertionSign);

		this.fromField = new JTextField(10);
		//this.fromField.setMinimumSize(new Dimension(50, 250));
		this.toField = new JTextField(10);
		this.fromField.addFocusListener(new FocusFieldListener(this.toField));
		
		makeTheButton(convertionSign);
		addKeyListener(convertionSign);
		
		this.add(fromField);
		this.add(fromMeasurement);
		this.add(btn);
		this.add(toField);
		this.add(toMeasurement);
	}

	private void addKeyListener(String convertionSign) {
		// this.setFocusable(true);
		this.fromField.addKeyListener(new KeyListenerTextField(fromField, toField, convertionSign));
		// System.out.println("this.fromField is focusable => " + this.fromField.isFocusable());
	}

	private void makeTheButton(String convertionSign) {
		this.btn = new Button(convertionSign, this.fromField, this.toField);

	}

	private void testing(String convertionSign) {
		for (int i = 0; i < convertionSign.split("_To_").length; i++) {
			System.out.println(convertionSign.split("_To_")[i]);
			System.out.println(i);
		}
		System.out.println("\n");
	}

	private String getToWhichUnitOfMeasurementWeConvert(String convertionSign) {
		//System.out.println(convertionSign.split("_To_")[1]);
		return (convertionSign.split("_To_"))[1];
	}

	private String getFromWhichUnitOfMeasurementWeConvert(String convertionSign) {
		// System.out.println(convertionSign.split("_To_")[0]);
		return (convertionSign.split("_To_"))[0];
	}

	private void customizeRow() {
		// TODO Auto-generated method stub
		this.setBackground(Color.LIGHT_GRAY);
		GUI.setTopPadding(this);
	}

	public Row(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public Row(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public Row(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}

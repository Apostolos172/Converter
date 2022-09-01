package components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import actions.ConvertbtnListener;
import actions.FocusFieldListener;

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
			this.fromMeasurement.setText((convertionSign.split("_To_"))[0]);
			// System.out.println(convertionSign.split("_To_")[0]);
			this.toMeasurement.setText((convertionSign.split("_To_"))[1]);
			//System.out.println(convertionSign.split("_To_")[1]);	
		}
		for (int i = 0; i < convertionSign.split("_To_").length; i++) {
			System.out.println(convertionSign.split("_To_")[i]);
			System.out.println(i);
		}
		System.out.println("\n");

		this.fromField = new JTextField(20);
		//this.fromField.setMinimumSize(new Dimension(50, 250));
		this.toField = new JTextField(20);
		this.fromField.addFocusListener(new FocusFieldListener(this.toField));
		
		this.btn = new JButton("Convert");
		this.btn.addActionListener(new ConvertbtnListener(fromField, toField, convertionSign));
		//this.btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		this.add(fromField);
		this.add(fromMeasurement);
		this.add(btn);
		this.add(toField);
		this.add(toMeasurement);
	}

	private void customizeRow() {
		// TODO Auto-generated method stub
		this.setBackground(Color.LIGHT_GRAY);
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

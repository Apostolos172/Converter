package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import converters.Length;
import converters.Mach;
import converters.Mass;
import converters.Volume;
import helperWindows.PopUpFunctionalityIsMissing;

public class ScreenCreationbtnListener implements ActionListener {
	private String screen;

	public ScreenCreationbtnListener(String screen) {
		// TODO Auto-generated constructor stub
		this.screen = screen;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(this.screen) {
		  case "Mass":
			  new Mass();
		    break;
		  case "Volume":
			  new Volume();
		    break;
		  case "Mach":
			  new Mach();
		    break;
		  case "Length":
			  new Length();
		    break;
		  case "Area":
			  new PopUpFunctionalityIsMissing();
			  // new Area();
		    break;
		  case "Speed":
			  new PopUpFunctionalityIsMissing();
		    break;
		  case "Screw":
			  new PopUpFunctionalityIsMissing();
		    break;
		  case "Field":
			  new PopUpFunctionalityIsMissing();
		    break;
		  case "Byte":
			  new PopUpFunctionalityIsMissing();
		    break;
		  case "Car":
			  new PopUpFunctionalityIsMissing();
		    break;
		  case "Ok":
			  new PopUpFunctionalityIsMissing();
		    break;
		  default:
		    // code block
		}

	}

}

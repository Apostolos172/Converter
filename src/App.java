import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import main.Main_GUI;

public class App {
	
	// Calculator App
	// UTF-8 encoding
	// Window > Preferences > General > Workspace
	public static void main(String[] args) {
		
		changeLookAndFeel();		
		new Main_GUI();
		
	}

	private static void changeLookAndFeel() {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Main_GUI.class.getName()).log(Level.SEVERE, null, ex);
		}
		JFrame.setDefaultLookAndFeelDecorated(true);

	}
	

}

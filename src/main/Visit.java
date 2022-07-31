package main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Visit {
	
	private String toWhom;
	
	public Visit(String toWhom)
	{
		this.toWhom = toWhom;
		this.connectToURL(this.toWhom);
	}
	
	public void connectToURL(String url)
	{
	    if (Desktop.isDesktopSupported()) {    
	    	try {
				Desktop.getDesktop().browse(new URI(url));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	}
	
}

package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Visit;

public class VisitInfobtnListener implements ActionListener {
	
	private String url;

	public VisitInfobtnListener(String url) {
		super();
		this.url = url;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Visit(this.url);
	}

}

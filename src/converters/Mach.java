package converters;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import components.Footer;
import components.Header;
import main.*;

public class Mach extends JFrame{
	
	private JPanel mainPanel, northPanel, westPanel, centralPanel, centralgeneralPanel, southPanel;
	//northPanel
	private JLabel headerLabel;
	//westPanel
	private ImageIcon image;
	private JLabel imageLabel;
	private JButton visitf16Infobtn;
	//centralPanel
	private JLabel giveMachlabel, giveKmPerHour;
	private JTextField machtxt, resultHavingMachtxt, kmPerHourtxt, resultHavingkmPerHourtxt;
	private JButton convertmachbtn, convertkmPerHourbtn, visitInfobtn;
	//southPanel
	private JLabel footerLabel1, footerLabel2;
	
	public Mach()
	{
		super("Μετατροπέας αριθμού Μαχ");
		makeFrame();
	}
	
	public void makeFrame()
	{
		String routeforImages = "C:\\Users\\user\\eclipse-workspace\\Converter\\images\\converters\\mach";
		
		mainPanel = new JPanel(new BorderLayout());
		
		makeNorthPanel();
		makeWestPanel();
		makeCentralPanel();
		makeSouthPanel();
        
		this.setContentPane(mainPanel);
		
        GUI.setPadding(mainPanel);
		GUI.setSizeOfTheWindow(this);
		//this.setSize(1500, 850);
        
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void makeNorthPanel()
	{
		northPanel = new Header("Μετατροπή ταχύτητας από Μαχ σε km/ώρα και αντίστροφα", "text");
		mainPanel.add(northPanel,BorderLayout.NORTH);
	}
	
	public void makeWestPanel()
	{
		westPanel = new JPanel();
		westPanel.setLayout(new BoxLayout(westPanel,BoxLayout.Y_AXIS));
		GUI.setPadding(westPanel);
		
		image = new ImageIcon("images/converters/mach/airplane.png");
        imageLabel = new JLabel(image);
        
		visitf16Infobtn = new JButton("Πληροφορίες F16");
		visitf16Infobtn.setFont(GUI.getFont("sansSerifFontBig"));
		visitf16Infobtn.setBackground(Color.orange);
		visitf16InfobtnListener visitf16Infobtnlistener  = new visitf16InfobtnListener ();
		visitf16Infobtn.addActionListener(visitf16Infobtnlistener);
		
		westPanel.add(imageLabel);
		westPanel.add(new JLabel("<html><br></html>"));
		westPanel.add(visitf16Infobtn);
        
        westPanel.setBackground(Color.white);
        
        mainPanel.add(westPanel,BorderLayout.WEST);
	}
	
	public void makeCentralPanel()
	{
		centralPanel = new JPanel(new GridLayout(3,4,10,10));
		
		giveMachlabel = new JLabel("Δώσε Μαχ αριθμό");
		giveMachlabel.setFont(GUI.getFont("sansSerifFontMedium"));
		
		machtxt = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(machtxt);
		machtxt.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertmachbtn = new JButton("Μετέτρεψε");
		convertmachbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		convertmachbtnListener convertmachbtnlistener = new convertmachbtnListener();
		convertmachbtn.addActionListener(convertmachbtnlistener);
		
		resultHavingMachtxt = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(resultHavingMachtxt);
		resultHavingMachtxt.setFont(GUI.getFont("sansSerifFontMedium"));
		
		giveKmPerHour = new JLabel("Δώσε km ανά ώρα");
		giveKmPerHour.setFont(GUI.getFont("sansSerifFontMedium"));
		
		kmPerHourtxt = new JTextField(5);
		GUI.setLeftPaddingAtJTextField(kmPerHourtxt);
		kmPerHourtxt.setFont(GUI.getFont("sansSerifFontMedium"));
		
		convertkmPerHourbtn = new JButton("Μετέτρεψε");
		convertkmPerHourbtn.setFont(GUI.getFont("sansSerifFontMedium"));
		convertkmPerHourbtnListener convertkmPerHourbtnlistener = new convertkmPerHourbtnListener();
		convertkmPerHourbtn.addActionListener(convertkmPerHourbtnlistener);
		
		resultHavingkmPerHourtxt = new JTextField(10);
		GUI.setLeftPaddingAtJTextField(resultHavingkmPerHourtxt);
		resultHavingkmPerHourtxt.setFont(GUI.getFont("sansSerifFontMedium"));
		
		visitInfobtn = new JButton("Πληροφορίες");
		visitInfobtn.setFont(GUI.getFont("sansSerifFontMedium"));
		visitInfobtnListener visitInfobtnlistener = new visitInfobtnListener();
		visitInfobtn.addActionListener(visitInfobtnlistener);
		
		centralPanel.add(giveMachlabel);
		centralPanel.add(machtxt);
		centralPanel.add(convertmachbtn);
		centralPanel.add(resultHavingMachtxt);
		
		centralPanel.add(giveKmPerHour);
		centralPanel.add(kmPerHourtxt);
		centralPanel.add(convertkmPerHourbtn);
		centralPanel.add(resultHavingkmPerHourtxt);
		
		centralPanel.add(new JLabel(""));
		centralPanel.add(new JLabel(""));
		centralPanel.add(new JLabel(""));
		centralPanel.add(visitInfobtn);
		
		centralgeneralPanel = new JPanel(new GridLayout(2,1,5,5));
		centralgeneralPanel.add(centralPanel);
		
		JPanel panel = new JPanel();
		
		centralgeneralPanel.add(panel);
		
		centralPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		mainPanel.add(centralgeneralPanel,BorderLayout.CENTER);
	}
	
	public void makeSouthPanel()
	{
		southPanel = new Footer();
        mainPanel.add(southPanel,BorderLayout.SOUTH);
	}
	
	class visitf16InfobtnListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new Visit("https://el.wikipedia.org/wiki/F-16_Fighting_Falcon");
		}
		
	}
	
	class convertmachbtnListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			double mach = Double.parseDouble(machtxt.getText());
			resultHavingMachtxt.setText("" + Math_of_conversion.machTokmPerHour(mach));
		}
	}
	
	class convertkmPerHourbtnListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			double kmPerHour = Double.parseDouble(kmPerHourtxt.getText());
			resultHavingkmPerHourtxt.setText("" + Math_of_conversion.kmPerHourToMach(kmPerHour));
		}
		
	}
	
	class visitInfobtnListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			new Visit("https://el.wikipedia.org/wiki/Αριθμός_Μαχ");
		}
	}
	
}

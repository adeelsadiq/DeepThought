package DeepThought;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ParentWindow extends JFrame implements ActionListener {
	
	private String bgColor, name;
	
	
	 
	JFrame frame = new JFrame("Deep Thought");
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("FILE");
	JMenu help = new JMenu("Help");
	JMenuItem open = new JMenuItem("Open");
	JMenuItem history = new JMenuItem("History");  
	//Creating the panel at bottom and adding components
	JPanel panel = new JPanel(); // the panel is not visible in output
	JLabel label = new JLabel("Ask your pesky questions!");
	JLabel topLabel;
	JTextField myTextField = new JTextField(30); // accepts up to 100 characters
	JButton send = new JButton("Send");
	JButton reset = new JButton("Reset");
	// Text Area at the Center
	JTextArea myTextArea = new JTextArea();
	
	public ParentWindow() {
	
	}

	
	public void setBGcolor(String color) {
		this.bgColor = color;
	}
	
	public String getBGcolor() {
		return this.bgColor;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

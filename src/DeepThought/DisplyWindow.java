package DeepThought;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//this class is for drawing out the actual GUI component of the program

public class DisplyWindow extends TheTruth implements ActionListener{
	String name;
	
	JFrame frame = new JFrame("Deep Thought");
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("FILE");
	JMenu help = new JMenu("Help");
	JMenuItem open = new JMenuItem("Open");
	JMenuItem history = new JMenuItem("History");  
	//Creating the panel at bottom and adding components
	JPanel panel = new JPanel(); // the panel is not visible in output
	JLabel label = new JLabel("Ask your pesky questions!");
	JLabel topLabel = new JLabel("Ask DeepThought");
	JTextField myTextField = new JTextField(30); // accepts up to 100 characters
	JButton send = new JButton("Send");
	JButton reset = new JButton("Reset");
	// Text Area at the Center
	JTextArea myTextArea = new JTextArea("Ask DeepThought anything!         \n");
	
 


	public DisplyWindow() {
		//Creating the Frame
		myTextArea.setEditable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		menuBar.add(file);
		menuBar.add(help);
		this.name= JOptionPane.showInputDialog("What is your name buddy?");
		file.add(open);
		file.add(history);
//		JScrollPane scrollPane = new JScrollPane();//to make sure that the text scrolls if too many questions
//		scrollPane.add(myTextArea);
//		myTextArea.add(scrollPane);
		send.addActionListener(this);
		reset.addActionListener(this);
		history.addActionListener(this);
		open.addActionListener(this);

		//	    send.add(label);


		panel.add(label); // Components Added using Flow Layout
		panel.add(myTextField);
		panel.add(send);
		panel.add(reset);
		panel.setBackground(Color.orange);
		myTextField.setBackground(Color.LIGHT_GRAY);
		myTextArea.setBackground(Color.orange);
		//Adding Components to the frame.
//		frame.getContentPane().add(BorderLayout.NORTH, topLabel);
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, myTextArea); 
		
		frame.setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{ 
		TheWriter writer = new TheWriter(); //the file writing method keeper gets an instance created 
		String s = e.getActionCommand();  //creating the string instance to hold the action command 
		if (s.equals("Reset")) { //Verifying which button was pushed
			writer.erase(); //erasing the file if reset was pushed 
			myTextArea.setText(""); //erases the text area 
		}else if(s.equals("Send")) {{ //Verifying which button was pushed
			if (myTextField.getText().isBlank()) { //check if the text field is blank when the "ask" button is pressed. 
				myTextArea.append("Ask a question will you "+name+", or do you want me to guess the question too?\n");
			}else  {
				this.message = myTextField.getText();
				
				//appending Q&A to file and writing to text area in one go
				myTextArea.append(writer.write(name+" asks: "+message +"\nDeepThought says: "+writer.Answer()+"\n")); 
			}}
		} else if (s.equals("History")) { //Verifying which button was pushed
			TheReader reader = new TheReader();
			
			myTextArea.append(reader.read()); //reading from the text file and appending it to the text area
		} 
	}
}   



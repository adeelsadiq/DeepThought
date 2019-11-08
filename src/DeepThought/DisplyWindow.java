package DeepThought;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

import javax.swing.*;

//this class is for drawing out the actual GUI component of the program

public class DisplyWindow extends TheTruth implements ActionListener{
	JFrame frame = new JFrame("Deep Thought");
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("FILE");
	JMenu help = new JMenu("Help");
	JMenuItem open = new JMenuItem("Open");
	JMenuItem history = new JMenuItem("History");  
	//Creating the panel at bottom and adding components
	JPanel panel = new JPanel(); // the panel is not visible in output
	JLabel label = new JLabel("Ask your pesky questions");
	JLabel topLabel = new JLabel("Ask DeepThought");
	JTextField myTextField = new JTextField(30); // accepts up to 100 characters
	JButton send = new JButton("Send");
	JButton reset = new JButton("Reset");
	// Text Area at the Center
	JTextArea myTextArea = new JTextArea("Ask DeepThought anything!         \n");
//	JScrollPane scrollPane = new JScrollPane(myTextArea);//to make sure that the text scrolls if too many questions
	//	    JPopupMenu pop = new JPopupMenu();


	public DisplyWindow() {
		//Creating the Frame
		myTextArea.setEditable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		menuBar.add(file);
		menuBar.add(help);

		file.add(open);
		file.add(history);


		send.addActionListener(this);
		reset.addActionListener(this);
		history.addActionListener(this);
		open.addActionListener(this);

		//	    send.add(label);


		panel.add(label); // Components Added using Flow Layout
		panel.add(myTextField);
		panel.add(send);
		panel.add(reset);

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
		TheWriter keeper = new TheWriter(); //the file writing method keeper gets an instance created 
		String s = e.getActionCommand();  //creating the string instance to hold the action command 
		if (s.equals("Reset")) { //Verifying which button was pushed
			keeper.erase(); //erasing the file if reset was pushed 
			myTextArea.setText(""); //erases the text area 
		}else if (s.equals("Send")) { //Verifying which button was pushed
			if (myTextField.getText().isBlank()) { //check if the text field is blank when the "ask" button is pressed. 
				myTextArea.append("Ask a question will you, or do you want me to guess the question too?\n");
			}else {
				this.message = myTextField.getText();
				myTextArea.append(keeper.Keep("You asked DeepThought: "+message +"\nDeepThought says: "+keeper.Answer()+"\n")); //appending Q&A to file and writing to text area in one go
			}
		} else if (s.equals("History")) { //Verifying which button was pushed
			TheReader reader = new TheReader();
			try {
				myTextArea.append(reader.read());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
	}
}   



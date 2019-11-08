package DeepThought;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

//this class is for drawing out the actual GUI component of the program

public class OmniScope extends TheTruth implements ActionListener{
	  JFrame frame = new JFrame("Deep Thought");
	  JMenuBar mb = new JMenuBar();
	  JMenu m1 = new JMenu("FILE");
	  JMenu m2 = new JMenu("Help");
	  JMenuItem m11 = new JMenuItem("Open");
	  JMenuItem m22 = new JMenuItem("Save as");  
	//Creating the panel at bottom and adding components
	    JPanel panel = new JPanel(); // the panel is not visible in output
	    JLabel label = new JLabel("Ask your pesky questions");
	    JTextField tf = new JTextField(30); // accepts up to 100 characters
	    JButton send = new JButton("Send");
	    JButton reset = new JButton("Reset");
	    // Text Area at the Center
	    JTextArea ta = new JTextArea();
//	    JPopupMenu pop = new JPopupMenu();
	
	  
	public OmniScope() {
		 //Creating the Frame
	  
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600, 600);
	    mb.add(m1);
	    mb.add(m2);
	   
	    m1.add(m11);
	    m1.add(m22);

	    
	    send.addActionListener(this);
	    reset.addActionListener(this);
	    
//	    send.add(label);
	    
	 
	    panel.add(label); // Components Added using Flow Layout
	    panel.add(tf);
	    panel.add(send);
	    panel.add(reset);

	    //Adding Components to the frame.
	    frame.getContentPane().add(BorderLayout.SOUTH, panel);
	    frame.getContentPane().add(BorderLayout.NORTH, mb);
	    frame.getContentPane().add(BorderLayout.CENTER, ta);
	    frame.setVisible(true);
	   
	}
	@Override
	public void actionPerformed(ActionEvent e) 
    { 
		TheKeeper keeper = new TheKeeper(); //the file writing method keeper gets an instance created 
        String s = e.getActionCommand();  //creating the string instance to hold the action command 
        if (s.equals("Reset")) { //Verifying which button was pushed
           keeper.erase(); //erasing the file if reset was pushed 
        }else if (s.equals("Send")) { //Verifying which button was pushed
	        	if (tf.getText().isBlank()) {
	        		ta.append("Ask a question will you, or do you want me to guess the question too?\n");
	        	}else {
	           this.message = tf.getText();
	           ta.append(keeper.Keep("You asked DeepThought: "+message +"\nDeepThought says: "+keeper.Answer()+"\n")); //appending Q&A to file and writing to text area in one go
	        	}
	        } 
    }
    }   



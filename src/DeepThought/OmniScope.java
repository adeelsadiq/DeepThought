package DeepThought;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//this class is for drawing out the actual GUI component of the program

public class OmniScope implements ActionListener {
	  JFrame frame = new JFrame("Deep Thought");
	  JMenuBar mb = new JMenuBar();
	  JMenu m1 = new JMenu("FILE");
	  JMenu m2 = new JMenu("Help");
	  JMenuItem m11 = new JMenuItem("Open");
	  JMenuItem m22 = new JMenuItem("Save as");  
	//Creating the panel at bottom and adding components
	    JPanel panel = new JPanel(); // the panel is not visible in output
	    JLabel label = new JLabel("Enter Text");
	    JTextField tf = new JTextField(30); // accepts up to 100 characters
	    JButton send = new JButton("Send");
	    // Text Area at the Center
	    JTextArea ta = new JTextArea();
	  
	public OmniScope() {
		 //Creating the Frame
	  
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600, 600);
	    mb.add(m1);
	    mb.add(m2);
	   
	    m1.add(m11);
	    m1.add(m22);

	    
	    send.addActionListener(this);
	    JButton reset = new JButton("Reset");
	    send.add(label); // Components Added using Flow Layout
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
        String s = e.getActionCommand(); 
        if (s.equals("submit")) { 
            // set the text of the label to the text of the field 
           
  
            // set the text of field to blank 
            tf.setText("  "); 
        } 
    } 
}



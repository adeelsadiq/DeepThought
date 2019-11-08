package DeepThought;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//this class is for drawing out the actual GUI component of the program

public class OmniScope extends TheTruth implements ActionListener {
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
	    JButton reset = new JButton("Reset");
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
	    reset.addActionListener(this);
	    
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
        if (s.equals("Reset")) { 
        
           TheKeeper keeper = new TheKeeper();
           keeper.erase();
        }else if (s.equals("Send")) { 
	        	
	           message = tf.getText();
	           TheKeeper keeper = new TheKeeper(); //the file writing method keeper gets an instance created 
	           keeper.Keep("You asked DeepThought: "+message +"\nDeepThought says: "+ANSWER+"\n");
	           ta.append("You asked DeepThought: "+message +"\nDeepThought says: "+ANSWER+"\n");
//	           ta.append("\nDeepThought says: "+ANSWER);
	           
	        } 
    }
    }   



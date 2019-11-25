package DeepThought;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ChildWindow extends ParentWindow {
	
	public ChildWindow(){
		myTextArea.setEditable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		menuBar.add(file);
		menuBar.add(help);
//		this.name= JOptionPane.showInputDialog("What is your name buddy?");
		setName(JOptionPane.showInputDialog("What is your name buddy?"));
		myTextArea.append("Ask DeepThought anything!         \n");
		file.add(open);
		file.add(history);
		topLabel.setName("Ask DeepThought");
//		JScrollPane scrollPane = new JScrollPane();//to make sure that the text scrolls if too many questions
//		scrollPane.add(myTextArea);
//		myTextArea.add(scrollPane);
		send.addActionListener(this);
		reset.addActionListener(this);
		history.addActionListener(this);
		open.addActionListener(this);
	}

}

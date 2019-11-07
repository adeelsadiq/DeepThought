package DeepThought;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TheKeeper extends TheTruth implements ActionListener{
	String message;
	public TheKeeper() {
		
	}
	//add history file as well, that just appends everything written to log file to itself but only populates the main window if the history menu button is pressed  
	//-> also add history menu button too :D 
	
	void Keep(String Message) {
		
		try{
			
			PrintWriter scribe = new PrintWriter((new FileWriter("test.txt", true)));

	      	scribe.println(Message);
	      	this.message = Message;
	      	scribe.close();
	    }
	    catch (IOException e){
	      	System.out.println("Error: " + e.getMessage());
	    }
		finally {
		 	System.out.println("Writer over and out y'all");
		}

	}
	String TheMessage() { // overwrite the parent method
		
		return this.message;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

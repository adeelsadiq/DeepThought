package DeepThought;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//this is the main writer class, writes to the files and I want to also add arrays somehow, Maybe add users in here, they get stored in an array and get their own file 
//and we can access that by sidebar menu, but first the core project and then we can mess about with this.

public class TheKeeper extends TheTruth{
	
	public TheKeeper() {
		
	}
	//idea:
	//add history file as well, that just appends everything written to log file to itself but only populates the main window if the history menu button is pressed  
	//-> also add history menu button too :D 
	
	void Keep(String Message) { //this will be tied to the button "ask"
		
		try{
			String s = new SimpleDateFormat("dd:MM:yyyy-HH:mm:ss").format(Calendar.getInstance().getTime());

			PrintWriter scribe = new PrintWriter((new FileWriter("test.txt", true)));

	      	scribe.println(s+": "+Message);
	      	this.message = Message;
	      	scribe.close();
	    }
	    catch (IOException e){
	      	System.out.println("Error: " + e.getMessage());
	    }
	}
		
		void erase() {
			
			try{
				
				PrintWriter scribe = new PrintWriter((new FileWriter("test.txt")));

		      	scribe.println("");
		      	scribe.close();
		    }
		    catch (IOException e){
		      	System.out.println("Error: " + e.getMessage());
		    }

	}
	String TheMessage() { // overwrite the parent method
		
		return this.message;
	}
	
	
}

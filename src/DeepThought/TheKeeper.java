package DeepThought;
import java.io.*;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//this is the main writer class, writes to the files and I want to also add arrays somehow, Maybe add users in here, they get stored in an array and get their own file 
//and we can access that by sidebar menu, but first the core project and then we can mess about with this.

public class TheKeeper extends TheTruth{
	
	int i = new Random().nextInt(10);
	public TheKeeper() {
		
	}
	//idea:
	//add history file as well, that just appends everything written to log file to itself but only populates the main window if the history menu button is pressed  
	//-> also add history menu button too :D 
	
	String Keep(String Message) { //this will be tied to the button "ask"
		if (Message != null) {
		try{
			String s = new SimpleDateFormat("dd:MM:yyyy-HH:mm:ss").format(Calendar.getInstance().getTime());// getting time and date for each question

			PrintWriter scribe = new PrintWriter((new FileWriter("test.txt", true)));
	      	scribe.println(s+": \n"+Message); //adding date and time with each question
	      	this.message = Message;
	      	scribe.close();
	    }
	    catch (IOException e){
	      	System.out.println("Error: " + e.getMessage());
	    }}else {
	    	System.out.println("Ask a question will you, or do you want me to guess the question too?");
	    }
		return Message;
	}
		
		void erase() {//function to erase the file at the end of session, needs to be tied to the Exit function. 
			
			try{
				
				PrintWriter scribe = new PrintWriter((new FileWriter("test.txt")));

		      	scribe.println("");
		      	scribe.close();
		    }
		    catch (IOException e){
		      	System.out.println("Error: " + e.getMessage());
		    }

	}
		
	String Answer() {
		this.answer=answers[i];
		return answer;		
	}
	String TheMessage() { // overwrite the parent method
		
		return this.message;
	}
	
	
}

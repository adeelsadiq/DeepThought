package DeepThought;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//this is the main writer class, writes to the files and I want to also add arrays somehow, Maybe add users in here, they get stored in an array and get their own file 
//and we can access that by sidebar menu, but first the core project and then we can mess about with this.

public class TheWriter extends Message{

	
	public TheWriter() {

	} 

	String write(String Message) { //this will be tied to the button "ask" writes 
		Message msg = new Message();
		msg.write(Message);
		if (Message != null) {
			try{
				String time = new SimpleDateFormat("dd:MM:yyyy-HH:mm:ss").format(Calendar.getInstance().getTime());// getting time and date for each question

				PrintWriter writer = new PrintWriter((new FileWriter("test.txt", true)));
				
				writer.println(time+": \n"+Message); //adding date and time with each question
				this.message = Message;
				writer.close();
			}
			catch (IOException e){
				System.out.println("Error: " + e.getMessage());
			}}else {
				System.out.println("Ask a question will you, or do you want me to guess the question too?");
			}
		return Message;
	}

	void erase() {//function to erase the file at button push. 

		try{

			PrintWriter writer = new PrintWriter((new FileWriter("test.txt")));

			writer.println("");
			writer.close();
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}

	}

	String TheMessage() { // overwrite the parent method

		return this.message; 
	}


}

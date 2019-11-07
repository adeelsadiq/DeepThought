package DeepThought;
import java.io.*;

public class TheKeeper extends TheTruth{
	
	public TheKeeper() {
		
	}
	
	void Keep(String Message) {
		
		try{
			
			PrintWriter scribe = new PrintWriter((new FileWriter("test.txt", true)));

	      	scribe.println(Message);
	      	scribe.close();
	    }
	    catch (IOException e){
	      	System.out.println("Error: " + e.getMessage());
	    }
		finally {
		 	System.out.println("Writer out y'all");
		}

	}
	
}

package DeepThought;
import java.util.*;
import java.io.*;

//this is the file reader class, I also want to add an array to this somehow, not sure yet
//this needs looking at
public class TheReader extends TheTruth{

	public TheReader() {

	}

	String read(){//another way to error handle, we throw the error and the invoking method does the catching
		String Message=null;

		
			Scanner scanner = null;
			try {
				scanner = new Scanner(new FileReader("test.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (scanner.hasNextLine()) { // to avoid reading past the end of the file
				Message= Message + "\n"+ (scanner.nextLine());	//appending the string with the next string and a new line :D took us a while!
				
			}
			scanner.close();
	
		return Message; 
	}



}

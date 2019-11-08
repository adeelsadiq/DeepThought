package DeepThought;
import java.util.*;
import java.io.*;

//this is the file reader class, I also want to add an array to this somehow, not sure yet

public class TheReader extends TheTruth{

	public TheReader() {

	}

	String read() throws FileNotFoundException{//another way to error handle, we throw the error and the invoking method does the catching
		String Message=null;

		
			Scanner scanner = new Scanner(new FileReader("test.txt"));
			while (scanner.hasNextLine()) { // to avoid reading past the end of the file
				Message= (scanner.nextLine());	
			}
			scanner.close();
	
		return Message;
	}



}

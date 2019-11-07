package DeepThought;
import java.util.*;
import java.io.*;

public class TheSeeker extends TheTruth{
	
	public TheSeeker() {
		
	}
	
	void Seek() {
		

	    try {
			Scanner proclaimer = new Scanner(new FileReader("test.txt"));
	      	while (proclaimer.hasNextLine()) { // to avoid reading past the end of the file
			System.out.println(proclaimer.nextLine());	
		}
		proclaimer.close();
	     }
	     catch (FileNotFoundException e) {
		System.out.println("Error: " + e.getMessage());
	     }

	}
}

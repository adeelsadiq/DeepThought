package DeepThought;
import java.awt.EventQueue;
import java.util.*;


public class TheOracle {
	 
	public static void main(String[] args) {
		
		
//	  Scanner kb = new Scanner(System.in);	
//      String message = kb.nextLine();
      
//      TheKeeper keeper = new TheKeeper(); //the file writing method keeper gets an instance created 
     
//      keeper.Keep(message +" \n                     "+ANSWER);  // we call the keep message twice to store the question and answer in 
//      keeper.Keep(ANSWER);
      
      
      TheSeeker seeker = new TheSeeker();
      seeker.Seek();
    		  
//      keeper.erase();// this erases the file, I just have it here for now, will add it to the closing program somehow
	  
//      kb.close();
      
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OmniScope mainWin = new OmniScope();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
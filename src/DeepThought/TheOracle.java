package DeepThought;
import java.util.*;


public class TheOracle {
	static final String ANSWER = "The answer to your Question (if I can call it that) is ..... 42"; 
	public static void main(String[] args) {
		
		
	  Scanner kb = new Scanner(System.in);	
      String message = kb.nextLine();
      
      TheKeeper keeper = new TheKeeper(); //the file writing method keeper gets an instance created 
      keeper.Keep(message +" \n                     "+ANSWER);  // we call the keep message twice to store the question and answer in 
//      keeper.Keep(ANSWER);
      
      
      TheSeeker seeker = new TheSeeker();
      seeker.Seek();
    		  
	  
      kb.close();
      
	
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TheForum mainWin = new TheForum();
//				
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
	
}
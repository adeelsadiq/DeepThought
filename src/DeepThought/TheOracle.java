package DeepThought;
import java.awt.EventQueue;
import java.io.FileNotFoundException;


public class TheOracle {

	public static void main(String[] args) {


		//	  Scanner kb = new Scanner(System.in);	
		//      String message = kb.nextLine();

		//      TheKeeper keeper = new TheKeeper(); //the file writing method keeper gets an instance created 

		//      keeper.Keep(message +" \n                     "+ANSWER);  // we call the keep message twice to store the question and answer in 
		//      keeper.Keep(ANSWER);

		
		TheReader reader = new TheReader();
		try {
			System.out.println(reader.read());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//      keeper.erase();// this erases the file, I just have it here for now, will add it to the closing program somehow

		//      kb.close();


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplyWindow mainWin = new DisplyWindow();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
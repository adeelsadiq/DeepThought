package DeepThought;
import java.awt.EventQueue;
import java.io.FileNotFoundException;


public class TheOracle {

	public static void main(String[] args) {
		
//		TheReader reader = new TheReader();
//		try {
//			System.out.println(reader.read());
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}


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
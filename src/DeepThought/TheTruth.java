package DeepThought;
//the parent class for the  reader and writer. 
public class TheTruth {
	String message; 
	static final String ANSWER = "The answer to your Question (if I can call it that) is ..... 42";
	public TheTruth() {
		
	}
	
	void Keep() {
		//write function, children will overwrite
	}
	void seek() {
		//read function, children will overwrite
	}
	
	String TheMessage() { // this I will tie to a random button called the truth or something 
		return "Seek and you shall find"; //your random profound sounding nonsense 
	}
	
	
}

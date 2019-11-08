package DeepThought;
//the parent class for the  reader and writer. 
public class TheTruth {
	String message; 
	String answer;
	String answers[]= {"The answer is 42!","The Answer is *DRAMATIC PAUSE* ..... 42!!!","42","Its 42","Its 42 ok, now stop bugging me",
			"Like seriously its 42","interesting question, let me think about it... nope its still 42","do some work yourself its 20+20+2",
			"Its 101010","your answer in hex is 0x2A","You again? I told you already, its 42!",
			"All this brain and I am answering questions like this, *sigh the answer is 42","The answer is 24 written backwards","Ok Stop! its never going to be anything othe than 42!",};
	public TheTruth() {
		
	}
	
	void Keep() {
		//write function, children will overwrite
	}
	void seek() {
		//read function, children will overwrite
	}
	
	String TheMessage() { // this I will tie to a random button called the truth or something 
		return "Seek and you shall find"; //your random pseudo-profound nonsense 
	}
	
	
}

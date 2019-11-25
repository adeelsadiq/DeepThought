package DeepThought;

import java.util.ArrayList;
import java.util.Random;

//the parent class for the  reader and writer. 
public class Message {
	int i = new Random().nextInt(14); //this will give us a random number that we can use to access the answers array element at random
	String message; 
	String answer;
	String answers[]= {"The answer is 42!","The Answer is *DRAMATIC PAUSE* ..... 42!!!","42","Its 42","Its 42 ok, now stop bugging me",
			"Like seriously its 42","interesting question, let me think about it... nope its still 42","do some work yourself its 20+20+2",
			"Its 101010","your answer in hex is 0x2A","You again? I told you already, its 42!",
			"All this brain and I am answering questions like this, *sigh the answer is 42","The answer is 24 written backwards","Ok Stop! its never going to be anything othe than 42!",};
	ArrayList <String> messages = new ArrayList<String>();
	
	public Message() {
		
	}

	String write() {
		//write function, children will overwrite
		return "Nothing to Write here folks!";
	}
	
	String write(String message) {
		int len= messages.size();
		messages.add(message);
		
		System.out.println(message);
		return "Message added to array";
	}
	String read() {
		//read function, children will overwrite
		return "Nothing to read here folks!";
	}
	String answer() {
		this.answer=answers[i];
		return answer;	
	}
} 



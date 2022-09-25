package customException;

public class ExceptionDemo {
	String message;
	public ExceptionDemo(String message) {
		this.message=message;
	}
    //create method here
	String analyserMood(){
			if(message.contains("I am in Sad Mood"))
				return "SAD";
			if(message.contains("I am in Any Mood"))
				return "HAPPY";
			return "Not Valid Message" ;
		
	}
	
}

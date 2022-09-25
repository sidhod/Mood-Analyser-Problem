package customException;

import stack.CustomException;

public class ExceptionDemo {
	String message;

	public ExceptionDemo(String message) {
		this.message = message;
	}

	// create method here
	String analyserMood() throws CustomException {
		try {
			if (message.contains("I am in Sad Mood"))
				return "SAD";
			if (message.contains("I am in Any Mood"))
				return "HAPPY";
		} catch (Exception e) {
			throw new CustomException("Null or Empty");
		}
		return "Not Valid Message";

	}

}

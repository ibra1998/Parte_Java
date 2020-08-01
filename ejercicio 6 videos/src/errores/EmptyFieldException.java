package errores;
/*
 * this Exception is in case there is an empty value introduced to initialize a variable:
 * If the value in the String variable is "", it should show the message the user wants
 * 
 */
public class EmptyFieldException extends Exception {
	public EmptyFieldException() {}
	public EmptyFieldException(String message) {
		super(message);
	}

}

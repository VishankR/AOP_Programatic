package exceptions;

public class AccNoInvalid extends RuntimeException{
	@Override
	public String toString() {
		return "Account no is invalid";
	}
}

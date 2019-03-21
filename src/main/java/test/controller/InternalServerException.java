package test.controller;

@SuppressWarnings("serial")
public class InternalServerException extends Exception {

	public InternalServerException(Exception e) {
		super(e);
	}

	public InternalServerException(String message) {
		super(message);
	}
	
}
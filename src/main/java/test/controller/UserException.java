package test.controller;

@SuppressWarnings("serial")
public class UserException extends Exception{

	public UserException(String msg) {
		super(msg);
	}

	public UserException(Exception e) {
		super(e);
	}

}

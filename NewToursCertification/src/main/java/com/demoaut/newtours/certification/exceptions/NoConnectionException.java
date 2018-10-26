package com.demoaut.newtours.certification.exceptions;

public class NoConnectionException extends AssertionError {

	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_PAGE_NOT_LOADED = "There is no connection. The page could not be loaded";
	public static final String MESSAGE_CONNECTION_FAILED = "Connection has failed. The page could not be loaded";
	
	
	public NoConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}

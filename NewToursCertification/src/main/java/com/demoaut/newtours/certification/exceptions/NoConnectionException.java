package com.demoaut.newtours.certification.exceptions;

/** Manejo de excepciones para los eventos donde una pagina o un elemento de la pagina no carga.
* <p>
* Se definen los mensajes cuando la pagina no carga y cuando la pagina se cae durante el proceso de carga.
*/

public class NoConnectionException extends AssertionError {

	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_PAGE_NOT_LOADED = "There is no connection. The page could not be loaded";
	public static final String MESSAGE_CONNECTION_FAILED = "Connection has failed. The page could not be loaded";
	
	
	public NoConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}

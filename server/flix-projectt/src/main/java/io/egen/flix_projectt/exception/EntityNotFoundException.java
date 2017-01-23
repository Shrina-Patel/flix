package io.egen.flix_projectt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {

private static final long serialVersionUID = 927689605461296457L;
	
	public EntityNotFoundException(String message){
		super(message);
	}
	
	public EntityNotFoundException(String message, Throwable cause){
		super(message,cause);
	}
}

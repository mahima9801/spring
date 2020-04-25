package com.capg.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE,reason="Username or password is invalid")
public class InvalidLoginException extends Exception{
	public InvalidLoginException() {
		super();
	}
}

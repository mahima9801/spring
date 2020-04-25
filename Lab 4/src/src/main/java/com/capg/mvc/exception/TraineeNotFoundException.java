package com.capg.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE,reason="No trainee with such Id")
public class TraineeNotFoundException extends Exception{
	public TraineeNotFoundException()
	{
		super();
	}
}

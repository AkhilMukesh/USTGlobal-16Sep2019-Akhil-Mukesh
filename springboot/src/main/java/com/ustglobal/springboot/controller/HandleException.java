package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

@RestControllerAdvice
public class HandleException {
	@ExceptionHandler(Exception.class)	
	public  EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Got Exception!!!!");
		response.setDescription("Exception found");
		return response;
	}
	

}

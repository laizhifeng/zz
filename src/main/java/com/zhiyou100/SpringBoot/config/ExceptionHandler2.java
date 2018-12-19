package com.zhiyou100.SpringBoot.config;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler2 {
	
	@ResponseBody
	@ExceptionHandler
	public String exceptionHandler(Exception exception){
		System.out.println(exception);
		return "网页走丢了";
	}
}

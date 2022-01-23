package com.nagammai.springbootstarter.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// no need plugin this class to spring framwork while scanning the classpath com.nagammai.springbootstarter.hello package it will do the needed for the class
//marked with annotations 
@RestController
public class helloController {

	//@GetMapping(value="/hello")
	@RequestMapping("hello")
	//http://localhost:8080/hello  this gives output as Hello in page 
	public String sayhello() {
		return "Hello";
	}
}

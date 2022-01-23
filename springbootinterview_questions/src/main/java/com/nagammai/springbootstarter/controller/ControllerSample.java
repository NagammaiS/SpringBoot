package com.nagammai.springbootstarter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller and other classes must be in package which starts with same package name as main class
//eg -> com.nagammai.springbootstarter.<anyname> else it will not scan 
@RestController
public class ControllerSample {

//Q . How to use a property defined in application.properties file into your java class ?
//Use the @Value annotation to access the properties which is defined in the application.properties file	

	//@Value("${server.port}")
	private String serverport;

	@RequestMapping(value = "/hello" , method = RequestMethod.GET)
	public String getDemo() {
		//prints 9080 from application.properties file
		return serverport;
		
	}
}


//Q.  Difference between @RequestMapping and @GetMapping

//@RequestMapping can be used with GET,POST,PUT,DELETE,PATCH using method attribute 
//@RequestMapping is a class level as well as method level 

//@GetMapping is only the extension of @RequestMapping which helps to improve clarity on requests (Spring 4.3)
//@GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
//@GetMapping is a method-level
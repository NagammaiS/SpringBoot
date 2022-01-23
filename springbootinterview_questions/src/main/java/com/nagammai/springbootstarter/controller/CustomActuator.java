package com.nagammai.springbootstarter.controller;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

//Q. How to create Custom Endpoints ?
//Ans: This can be acheived by adding the following annotations 
//@Endpoint and @Component to class 
//@ReadOperation , @Write Operation and @Delete Operation on method level 
//
//@ReadOperation maps to HTTP GET
//@WriteOperation maps to HTTP POST
//@DeleteOperation maps to HTTP Delete
//By adding @Bean annotated with @Endpoint, any methods annotated with @ReadOperation,@WriteOperation or @DeleteOperation are automatically exposed over JMX or HTTP 

//http://localhost:7080/actuator/customActuator
//	Give current DB status of the application

@Component
@Endpoint(id="customActuator")
public class CustomActuator {

	@ReadOperation
	public String currentDbDetails() {
		return "Give current DB status of the application";
	}
	
//	@WriteOperation
//	public String writeOperation(String name) {
//		return name+"in HTTP POST method";
//	}
//Whatever we give in post method , that  name will be given back as output 
	
//	@DeleteOperation
//	public String delete() {
//		return "HTTP Delete method";
//	}
	
}



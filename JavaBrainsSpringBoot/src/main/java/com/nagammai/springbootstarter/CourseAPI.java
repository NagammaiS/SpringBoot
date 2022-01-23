package com.nagammai.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//standalone   --> no need servlet container spring boot is all you need  
//production ready 
//opinionated 80% spring does 20% can change
//convention over configuration

//starting of the application CourseAPI start the servlet container and host the application in servlet container 
@SpringBootApplication
public class CourseAPI {
	
	// does not need a servlet container to run a application spring boot can run a standalone application with main method
	public static void main(String args[]) {
		//static method of the class SpringApplication with class name with main method 
		SpringApplication.run(CourseAPI.class,args);
	}
	
}
//Starting Spring Boot :
//1.Sets up default configuration -> 80% is addressed by spring 
//2.Starts  Spring application context -> 
//Spring has container for all diffrent services business,controller,data services etc which is the application context,every spring application has the application context (container) runs when the spring application runs,
//SB creates this application context(container)
//3.Performs class path scan -> scan classes with different annotations and scans class path with annotations 
//4.Starts Tomcat server (it is a standalone because no need to download servlet container SB provides it)




package com.nagammai.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//Q. How to disable a specific auto configuration?
//We can use exclude attribute of @EnableAutoConfiguration if you find any specific auto-configuration classes that you do not want are being applied  , 
//can use commas , , , and exclude many files
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}) or 
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootinterviewQuestionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootinterviewQuestionsApplication.class, args);
	}

}

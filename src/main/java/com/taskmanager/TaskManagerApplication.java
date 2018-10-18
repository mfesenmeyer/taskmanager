package com.taskmanager;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taskmanager.business.Ticket;

@SpringBootApplication
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		final Logger logger = LogManager.getLogger(TaskManagerApplication.class);
		
       //implement your business logic here
    	Ticket ticketTest = new Ticket();
    	ticketTest.setTicketNumber(123);
    	ticketTest.setTicketTitle("Test Ticket");
    	
    	System.out.println(ticketTest);
    	logger.info(ticketTest);
    	
    }
	
}

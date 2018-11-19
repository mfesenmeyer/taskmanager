package com.taskmanager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taskmanager.business.Ticket;
import com.taskmanager.repository.TaskJdbcRepositoryDao;

@SpringBootApplication
public class TaskManagerApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}
	
	@Autowired
	TaskJdbcRepositoryDao dao;
	// Override then there needs to be a method declaration somewhere in the int/parent class that you're implementing/inheriting 
	@Override
    public void run(String... args) throws Exception {
		System.out.println("Test");
		Ticket test = dao.getTicketByNumber(1);
		
		System.out.println(test);

    
    }
	
}

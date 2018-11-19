package com.taskmanager.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.business.Ticket;
import com.taskmanager.repository.TaskJdbcRepositoryDao;

@RestController
public class TaskRestController {

	@Autowired
	TaskJdbcRepositoryDao dao;
	
    @RequestMapping("/getTasks/{ticketNumber}")
    public String getTasks(@PathVariable("ticketNumber") int ticketNumber) {
       Ticket test = dao.getTicketByNumber(ticketNumber);
       return test.toString();
    }
	
	
}

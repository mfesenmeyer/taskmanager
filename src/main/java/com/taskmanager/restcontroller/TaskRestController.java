package com.taskmanager.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taskmanager.business.Ticket;
import com.taskmanager.repository.TaskJdbcRepositoryDao;

@RestController
public class TaskRestController {

	@Autowired
	TaskJdbcRepositoryDao dao;
	// Import this for Serialization
	ObjectMapper mapper = new ObjectMapper();

	// Service request returns one ticket based on ticket number search criteria
    @RequestMapping(value="/getTasks/{ticketNumber}", method = RequestMethod.GET, produces = "application/json")
    public String getTasks(@PathVariable("ticketNumber") int ticketNumber) throws JsonProcessingException {
       Ticket ticket = dao.getTicketByNumber(ticketNumber);
       String jsonInString = mapper.writeValueAsString(ticket);
       return jsonInString;
    }
		
    
//    @RequestMapping(value="/insertTicket/{ticketNumber}", method = RequestMethod.GET, produces = "application/json")
//    public String getTasks(@PathVariable("ticketNumber") int ticketNumber) throws JsonProcessingException {
//       Ticket ticket = dao.getTicketByNumber(ticketNumber);
//       String jsonInString = mapper.writeValueAsString(ticket);
//       return jsonInString;
//    }
    
}

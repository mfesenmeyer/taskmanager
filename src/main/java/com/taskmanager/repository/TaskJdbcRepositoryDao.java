package com.taskmanager.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.taskmanager.business.Ticket;

@Repository
public class TaskJdbcRepositoryDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	class TicketRowMapper implements RowMapper<Ticket> {
		@Override
		public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
			Ticket ticket = new Ticket();
			ticket.setTicketNumber(rs.getInt("ticket_number"));
			ticket.setTicketTitle(rs.getString("ticket_title"));
			ticket.setTicketNote(rs.getString("ticket_note"));
			return ticket;
		}
	}
	
	// Returns the ticket from the DB - search criteria ticketnumber
	public Ticket getTicketByNumber(int ticketNumber) {
		return jdbcTemplate.queryForObject("select * from ticket where ticket_number=?", new Object[] { ticketNumber },
				new TicketRowMapper());
	}
	// Adds a ticket into the DB 
	public void addTicket(Ticket ticket) {
	   String sql = "INSERT INTO ticket (ticket_number, ticket_title, ticket_note) values (?, ?, ?)";
	   jdbcTemplate.update(sql, ticket.getTicketNumber(), ticket.getTicketTitle(), ticket.getTicketNote());
	}
	// Adds a ticket into the DB - missing dates for now 
	public void addComplTicket(Ticket ticket) {
	   String sql = "INSERT INTO ticket_table (ticket_title, ticket_note, ticket_tag, ticket_alert, ticket_status) values (?, ?, ?, ?, ?)";
	   jdbcTemplate.update(sql, ticket.getTicketTitle(), ticket.getTicketNote(), ticket.getTicketTag(), ticket.getTicketAlert(), ticket.getTicketStatus());
	}
}

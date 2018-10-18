package com.taskmanager.business;

public class Ticket {

	private int ticketNumber;
	private String ticketTitle;
	
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTicketTitle() {
		return ticketTitle;
	}
	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", ticketTitle=" + ticketTitle + "]";
	}
}

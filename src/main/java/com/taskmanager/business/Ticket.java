package com.taskmanager.business;

public class Ticket {

	private int ticketNumber;
	private String ticketTitle;
	private String ticketNote;
	
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int l) {
		this.ticketNumber = l;
	}
	public String getTicketTitle() {
		return ticketTitle;
	}
	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}
	
	public String getTicketNote() {
		return ticketNote;
	}
	public void setTicketNote(String ticketNote) {
		this.ticketNote = ticketNote;
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", ticketTitle=" + ticketTitle + ", ticketNote=" + ticketNote
				+ "]";
	}
}

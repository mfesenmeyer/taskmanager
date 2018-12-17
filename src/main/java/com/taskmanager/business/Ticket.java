package com.taskmanager.business;

public class Ticket {

	private int ticketNumber;
	private String ticketTitle;
	private String ticketNote;
	private String ticketTag;
	private Boolean ticketAlert;
	private String ticketStatus;
	
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
	public String getTicketTag() {
		return ticketTag;
	}
	public void setTicketTag(String ticketTag) {
		this.ticketTag = ticketTag;
	}
	public Boolean getTicketAlert() {
		return ticketAlert;
	}
	public void setTicketAlert(Boolean ticketAlert) {
		this.ticketAlert = ticketAlert;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", ticketTitle=" + ticketTitle + ", ticketNote=" + ticketNote
				+ ", ticketTag=" + ticketTag + ", ticketAlert=" + ticketAlert + ", ticketStatus=" + ticketStatus + "]";
	}

}

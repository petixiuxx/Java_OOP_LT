package com.ticket;
import java.util.Date;

public abstract class Ticket {
	protected Date issuedDate;
	protected int value;
	private Gate origin;
	public Ticket(int value, Date issuedDate ) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.issuedDate = issuedDate; 
	}
	public int getValue() {
		return value;
	}
	public void adjustValue(int value) {
		this.value = value;
	}
	public void setOrigin(Gate origin) {
		this.origin = origin;
	}
	public Gate getOrigin() {
		return origin;
	}
	public abstract boolean isValid();
}

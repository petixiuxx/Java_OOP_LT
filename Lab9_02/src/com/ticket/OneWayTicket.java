package com.ticket;

import java.util.Date;

public class OneWayTicket extends Ticket {
	private boolean valid = true;

	public OneWayTicket(int value, Date issuedDate) {
		super(value, issuedDate);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Gate getOrigin() {
		// TODO Auto-generated method stub
		return super.getOrigin();
	}
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		Date current = new Date();
		
		return this.valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}

package com.ticket;

import java.util.Date;

public class PrepaidCard extends Ticket implements ICard {
	public PrepaidCard(int value, Date issuedDate) {
		super(value, issuedDate);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void add(int value) {
		// TODO Auto-generated method stub
		this.value += value; 
	}
	@Override
	public boolean deduct(int value) {
		// TODO Auto-generated method stub
		if (this.value < value) return false;
		
		this.value -= value;
		return true;
	}
	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}
}

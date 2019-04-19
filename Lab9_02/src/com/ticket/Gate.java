package com.ticket;

public class Gate {
	private String name;
	private int distance;
	public Gate(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void enter(Ticket ticket) {
		 if (ticket.isValid()) {
			 ticket.setOrigin(this);
			 System.out.println("Recored");
			 return;
		 }
		 this.close();
	}
	public int getDistance() {
		return distance;
	}
	public void exit(Ticket ticket) {
		Line rail = new Line();
		int fare = rail.getFare(this.getDistance() - ticket.getOrigin().getDistance());
		int value = ticket.getValue();
		if (value < fare) {
			System.out.println("Value is insufficient");
			this.close();
			return;
		}
		if (ticket instanceof OneWayTicket) {
			((OneWayTicket) ticket).setValid(false);
		}
		else {
			((PrepaidCard) ticket).deduct(fare);
		}
		
	}
	public void open() {
		System.out.println("The gate " + this.name + " is opened");
	}
	public void close() {
		System.out.println("The gate " + this.name + " is closeed");
	}
}

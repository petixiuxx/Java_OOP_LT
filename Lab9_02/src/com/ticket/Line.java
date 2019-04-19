package com.ticket;

public class Line {
	public int getFare(int distance) {
		int fare = 0;
		if (distance <= 4) {
			fare += 120;
		}
		else {
			int addition = (distance - 4) % 2 == 0 ? (distance - 4) / 2 : (distance - 4) / 2 + 1;
			fare = 120 + addition * 30;
		}
		return fare;
	}
}

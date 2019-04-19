package com.ticket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Line l = new Line();
		Ticket ve = new OneWayTicket(440, new Date());
//		System.out.println(l.getFare(7));
		Gate A = new Gate("A", 0);
		Gate B = new Gate("B", 17);
		Gate C = new Gate("C", 22);
		Gate D = new Gate("D", 33);
		A.open();
		A.enter(ve);
		B.exit(ve);
		System.out.println(ve.getOrigin().getName());
		System.out.println(ve.isValid());
//		Ticket ve1 = new OneWayTicket(10, new Date());
//		System.out.println(ve1 instanceof PrepaidCard);
//		calculateDate();
	}
//	public static void calculateDate() throws ParseException {
//		SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/yyyy", Locale.CHINESE);
//		Date date2 = date1.parse("04/17/2019");
//		Date date3 = new Date();
//		
//		System.out.println(date3.getTime() - date2.getTime());
//		System.out.println(24 * 60 * 60 * 1000);
//	}
}

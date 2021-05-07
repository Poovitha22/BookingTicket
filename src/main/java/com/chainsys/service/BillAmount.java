package com.chainsys.service;

import java.util.ArrayList;
import java.util.List;

public class BillAmount {
	/**
	 * This Method is used to display busType......
	 */
	public static void displayBusType() {
		// This list is used to display the bus type
		List<String> serviceclass = new ArrayList<String>();
		serviceclass.add("AC Sleeper");
		serviceclass.add("AC Sleeper Seater");
		serviceclass.add("Classic");
		serviceclass.add("Delux");
		serviceclass.add("Non AC Sleeper");
		serviceclass.add("Non AC Sleeper Seater");
		serviceclass.add("Ordinary");
		System.out.println("Set 1 : " + serviceclass.get(0));
		System.out.println("Set 2 : " + serviceclass.get(1));
		System.out.println("Set 3 : " + serviceclass.get(2));
		System.out.println("Set 4 : " + serviceclass.get(3));
		System.out.println("Set 5 : " + serviceclass.get(4));
		System.out.println("Set 6 : " + serviceclass.get(5));
		System.out.println("Set 7 : " + serviceclass.get(6));
	}

	/**
	 * This ArrayList is used to Display the Ticket Cost
	 */
	static ArrayList<String> ticketList = new ArrayList<String>();

	// Display the cost of the tickets
	public static void displayTickets() {
		//System.out.println("DISPLAY THE COST OF THE TICKETS");
		for (String string : ticketList) {
			System.out.println(string);
		}
	}

	/**
	 * THIS METHOD IS USED TO DISPLAY THE AMOUNT
	 * 
	 * @param busType
	 * @param noOfPassengers
	 */

	public static double bustype(int busType, int noOfPassengers) {
		double d=0;
		switch (busType) {
		case 1: {
			System.out.println("YOU BOOKING A AC SLEEPER COACH AND YOUR BUS FARE AMOUNT IS RS.1200/- PER PERSON");
			d = noOfPassengers * 1200;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 2: {
			System.out
					.println("YOU BOOKING A AC SLEEPER SEATER COACH AND YOUR BUS FARE AMOUNT IS RS.1100/- PER PERSON");
			d = noOfPassengers * 1100;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 3: {
			System.out.println("YOU BOOKING A CLASSIC COACH AND YOUR BUS FARE AMOUNT IS RS.1000/- PER PERSON");
			d = noOfPassengers * 1000;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 4: {
			System.out.println("YOU BOOKING A DELUX COACH AND YOUR BUS FARE AMOUNT IS RS.900/- PER PERSON");
			d = noOfPassengers * 900;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 5: {
			System.out.println("YOU BOOKING A NON AC SLEEPER COACH AND YOUR BUS FARE AMOUNT IS RS.800/- PER PERSON");
			d = noOfPassengers * 800;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 6: {
			System.out.println(
					"YOU BOOKING A NON AC SLEEPER SEATER COACH AND YOUR BUS FARE AMOUNT IS RS.700/- PER PERSON");
			d = noOfPassengers * 700;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 7: {
			System.out.println("YOU BOOKING A ORDINARY COACH AND YOUR BUS FARE AMOUNT IS RS.600/- PER PERSON");
			d = noOfPassengers * 600;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		default:
		{
			d=0;
			System.out.println("INVAILD BUSTYPE");
		}
		}
      return d;
	}

	public static void main(String[] args) {
		displayBusType();
		int busType = 8;//bus type.....
		System.out.println("ENTER THE BUS TYPE :" + busType);
		int noOfPassengers = 5;// Passenger count.......
		System.out.println("ENTER THE COSTUMER LIST :" + noOfPassengers);
		double result = bustype(busType, noOfPassengers);
		displayTickets();

	}

}

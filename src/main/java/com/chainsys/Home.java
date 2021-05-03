package com.chainsys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Home {
	/**
	 * THIS METHOD USED TO DISPLAY THE BOOKING DETAILS
	 * @param routeNo
	 */
	public static void bookingRoutes(int bookingNo) {
		switch (bookingNo) {
		case 1: {
			System.out.println("YOU BOOKING CHENNAI TO MADURAI ");
			break;
		}
		case 2: {
			System.out.println("YOU BOOKING CHENNAI TO TRICHY ");
			break;
		}
		case 3: {
			System.out.println("YOU BOOKING CHENNAI TO THENI ");
			break;
		}
		case 4: {
			System.out.println("YOU BOOKING CHENNAI TO VILUPURAM ");
			break;
		}
		case 5: {
			System.out.println("YOU BOOKING CHENNAI TO KOVAI ");
			break;
		}
		}
	}

	static ArrayList<String> ticketList = new ArrayList<String>();
	// Display the cost of the tickets
	public static void displayTickets() {
		System.out.println("DISPLAY THE COST OF THE TICKETS");
		for (String string : ticketList) {
			System.out.println(string);
		}
	}
	/**
	 * THIS METHOD IS USED TO DISPLAY THE AMOUNT
	 * @param busType
	 * @param noOfPassengers
	 */
	
	public static void bustype(int busType, int noOfPassengers) {
		int d;
		switch (busType) {
		case 1: {
			System.out.println("YOU BOOKING A AC SLEEPER COACH AND YOUR BUS FARE AMOUNT IS RS.1200/- PER PERSON");
			d = noOfPassengers * 1200;
			System.out.println("YOUR TOTAL BUS FARE AMOUNT IS RS." + d + "/-");
			ticketList.add("Ticket - Cost Rs. " + d);
			break;
		}
		case 2: {
			System.out.println("YOU BOOKING A AC SLEEPER SEATER COACH AND YOUR BUS FARE AMOUNT IS RS.1100/- PER PERSON");
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
			System.out.println("YOU BOOKING A NON AC SLEEPER SEATER COACH AND YOUR BUS FARE AMOUNT IS RS.700/- PER PERSON");
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
		}

	}


	public static void main(String[] args) {
		//list the bus routes........
		List<String> departments = new ArrayList<String>();
		departments.add("CHENNAI TO MADURAI ");
		departments.add("CHENNAI TO TRICHY");
		departments.add("CHENNAI TO THENI");
		departments.add("CHENNAI TO VILUPURAM");
		departments.add("CHENNAI TO KOVAI");
		System.out.println("List 1 : " + departments.get(0));
		System.out.println("List 2 : " + departments.get(1));
		System.out.println("List 3 : " + departments.get(2));
		System.out.println("List 4 : " + departments.get(3));
		System.out.println("List 5 : " + departments.get(4));
		int routeNo = 2;
		System.out.println("ENTER THE BUS ROUTE :" + routeNo);
		bookingRoutes(routeNo);
		LocalDate now = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println("date:" + now + " time:" + time);//display date and time
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
		int busType = 4;
		System.out.println("ENTER THE BUS TYPE :" + busType);
		int noOfPassengers = 5;//Passenger count
		System.out.println("ENTER THE COSTUMER LIST :" + noOfPassengers);
		bustype(busType, noOfPassengers);
		displayTickets();
		
	}

}

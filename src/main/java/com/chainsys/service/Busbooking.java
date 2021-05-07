package com.chainsys.service;

import java.util.ArrayList;
import java.util.List;

public class Busbooking {
	/**
	 * This method is used to booking our Routes.......
	 * @param bookingNo
	 */
	public static void bookingRoutes(int bookingNo) {
		switch(bookingNo) {
		case 1: {
			System.out.println("YOU BOOKING CHENNAI TO MADURAI");
			break;
		}
		case 2: {
			System.out.println("YOU BOOKING CHENNAI TO TRICHY");
			break;
		}
		case 3: {
			System.out.println("YOU BOOKING CHENNAI TO THENI");
			break;
		}
		case 4: {
			System.out.println("YOU BOOKING CHENNAI TO VILUPURAM");
			break;
		}
		case 5: {
			System.out.println("YOU BOOKING CHENNAI TO KOVAI");
			break;
		}
		}
	  }
	/**
	 * To List the Bus Routes........
	 */
	public static void busRoutes()
	{
	
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
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int routeNo = 2;
		busRoutes();
		System.out.println("ENTER THE BUS ROUTE :" + routeNo);
		bookingRoutes(routeNo);


	}

}

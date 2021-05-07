package com.chainsys.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BusRoutes {

	/**
	 * To add the BusRoutes.......
	 */
	static Map<Integer, String> routes = new HashMap<Integer, String>();

	public static void addBusRoutes() {
		routes.put(1, "ChennaiToMadurai");
		routes.put(2, "ChennaiToTrichy");
		routes.put(3, "ChennaiToTheni");
		routes.put(4, "ChennaiToVilupuram");
		routes.put(5, "ChennaiToKovai");

	}

	public static void addRoute(int routeNo, String routeDetails) {
		routes.put(routeNo, routeDetails);
	}
	/**
	 * Display the available routes...... 
	 */

	public static void displayRoutes() {
		System.out.println("DISPLAY THE BUS ROUTES");
		for (Integer routeNo1 : routes.keySet()) {
			String routeDetails1 = routes.get(routeNo1);
			System.out.println("Route " + routeNo1 + ", details=" + routeDetails1);
		}
	}
/**
 * To Display the routeNumber from the routeDetails.......
 * @param value
 * @return
 */
	public static int getKeyFromValue(String value) {
		Set<Integer> keys= routes.keySet();
		int routeNum = 0;
		for (Integer routeNo : keys ) {
			String routeDetails = routes.get(routeNo);

			if (routeDetails.equalsIgnoreCase(value)) {
				routeNum = routeNo;
			}
			else {
				routeNum = -1;
			}
		}
		return routeNum;
	}
	public static void main(String[] args) {
		int routeNo = 1;
		addBusRoutes();
		addRoute(6, "chennai to dindugal");// add the bus routes if the route is available
		displayRoutes();
		// display your booking route
		String routeDetails = routes.get(routeNo); // chennai to madurai.....
		
		System.out.println("Your route " + routeDetails);
		System.out.println(getKeyFromValue("Chennai to Theni"));

	}
}
package com.chainsys;

import java.util.HashMap;

public class BusRoutes {

	//Add the Bus Routes
		static HashMap<Integer,String> routes = new HashMap<Integer,String>();
		
		public static void addBusRoutes() {	
				routes.put(1, "Chennai to Madurai");
				routes.put(2, "Chennai to Trichy");
				routes.put(3, "Chennai to Theni");
				routes.put(4, "Chennai to vilupuram");
				routes.put(5, "Chennai to Kovai");
				
			}
		static HashMap< String, Integer > reversedRoutes=new HashMap< String, Integer>();
		{
		//public static void reverse() {
	    for(Integer reverseRoute: routes.keySet())
		{
			reversedRoutes.put(routes.get(reverseRoute), reverseRoute);
			//System.out.println("Route " + reverseRoute + ", details=" + routeDetails1 );

		}
		
        }

		public static void addRoute(int routeNo, String routeDetails){
				routes.put(routeNo,routeDetails);
			}
		//Display the Available Bus Routes

		public static void displayRoutes() 
		{
		for(Integer routeNo1 : routes.keySet()){
			String routeDetails1 = routes.get(routeNo1);
			System.out.println("Route " + routeNo1 + ", details=" + routeDetails1 );
		  }
		}

		
				public static void main(String[] args) {
					int routeNo =1;
					System.out.println("DISPLAY THE BUS ROUTES");
					addBusRoutes();
					displayRoutes();
					addRoute(6,"chennai to dindugal");// add the bus routes if the route is available
					//display your booking route
					String routeDetails = routes.get(routeNo); //chennai to madurai.....
					System.out.println( "Your route " + routeDetails );

	}
}
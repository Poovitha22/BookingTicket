package com.chainsys.service;

import java.util.HashMap;


public class VehiclesDetails {
	/**
	 * Display the BusNmuber.........
	 */
   public static void BusNumber() {
	   HashMap<Integer,String> plateNo=new HashMap<Integer,String>();

	   plateNo.put(1,"TN 63 TN 6754");
	   plateNo.put(2,"TN 58 TN 0064");
	   plateNo.put(3,"TN 01 TN 7632");
	   plateNo.put(4,"TN 63 TN 6504");
	   
	   for(Integer vehicle:plateNo.keySet())
	   {
		   String vehiclesNo1=plateNo.get(vehicle);
		   System.out.println("Bus No : "+ vehicle +" VECHILE NUMBER :" + vehiclesNo1);
		  
	   }
	   String string=plateNo.get(2);
		System.out.println("YOUR BUS VEHICLE NUMBER IS " + string);
      }
	public static void main(String[] args) {

		BusNumber();

		

	}

}

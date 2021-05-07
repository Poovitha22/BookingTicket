package com.chainsys;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.chainsys.service.BusRoutes;

public class BusRoutesTest {


	@Test
	public void testcase() 
	{
		BusRoutes.addBusRoutes();
	}
	@Test
	public void testcase1() {

		BusRoutes.addRoute(6,"chennai to nellai");
	}
	@Test
	public void testcase2() {

		BusRoutes.displayRoutes();
	}
	@Test
	public void testcase3() {
        String busRoute = "ChennaiToMadurai";
		int results = BusRoutes.getKeyFromValue(busRoute);
		assertEquals(1,results);

		
      }
	
}

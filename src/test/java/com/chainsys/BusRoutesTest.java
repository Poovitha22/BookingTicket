package com.chainsys;


import org.junit.Test;

public class BusRoutesTest {

	@Test
	public void testcase1() {
		BusRoutes.addBusRoutes();
		BusRoutes.addRoute(6,"chennai to nellai");
		BusRoutes.displayRoutes();
		
      }
	
}

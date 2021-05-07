package com.chainsys;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chainsys.service.BillAmount;

public class BillAmountTest {

	@Test
	public void test1() {
		int busType=3;
		int noOfPassengers=3;
		double result =BillAmount.bustype(busType, noOfPassengers);
		assertEquals(result,3000.0,0.001);
	}
	@Test
	public void test2() {
		int busType=8;
		int noOfPassengers=3;
		double result =BillAmount.bustype(busType, noOfPassengers);
		assertEquals(result,0.0,0.001);
	}
}

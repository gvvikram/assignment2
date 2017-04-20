package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.main.PrimeFactor;

public class PrimeFactorTest {
	PrimeFactor pf=null;

	@Before
	public void setUp() throws Exception {
		pf=new PrimeFactor();
	}

	@Test
	public void PrimeFact_zeroTest() {
		String Result=pf.primeFactors(0);
		assertEquals("You entered zero",Result);
	}
	@Test
	public void PrimeFact_oneTest() {
	String Result=pf.primeFactors(1);
	assertEquals("No prime factors possible for 1",Result);
	}
	@Test
	public void PrimeFactTest() {
		String Result=pf.primeFactors(75);
		assertEquals("3 5 ",Result);
		}
	

}
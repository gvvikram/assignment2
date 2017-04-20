package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.main.SwapWithOutTemp;

public class SwapWithOutTempTest {

	SwapWithOutTemp a=null;
	 
	@Before
	public void setup(){
	 a=new SwapWithOutTemp();
	}
	@Test
	public void positive_test() {
	String result=a.swap(25, 7);
	assertEquals("7 25",result);
	}
	@Test
	public void negative_test() {
	String result=a.swap(-5, -10);
	assertEquals("-10 -5",result);
	}
	@Test
	public void equal_test() {
	String result=a.swap(8,8 );
	assertEquals("you entered the same values",result);
	}
}

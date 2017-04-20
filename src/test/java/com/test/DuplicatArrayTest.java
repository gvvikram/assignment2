package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.DuplicatArray;

public class DuplicatArrayTest {
	DuplicatArray dr;
	//int b[]={2,8,46,35,5,8,9};
	@Before
	public void setUp() throws Exception {
		dr=new DuplicatArray();
	}

	@Test
	public void test() {
		int[] abb={1,2,5,5,5,6,6,6,5};
		String result=dr.duplicate(abb);
		assertEquals("1 2 5 6 ",result);
	}
	

}

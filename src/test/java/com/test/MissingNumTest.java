package com.test;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import com.main.MissingNum;

public class MissingNumTest {
	LinkedList<Integer> al2;
	LinkedList<Integer> al1=null;

	@Before
	public void setUp()
	{
		al2=new LinkedList<Integer>();
	}

	@Test
	public void test() {
		MissingNum z=new MissingNum();
		al1= z.findMissingNumbers(new int[]{5,2,6,9});
	    al2.add(3);
		al2.add(4);
		al2.add(7);
		al2.add(8);
		assertTrue(al2.equals(al1));
	}

}

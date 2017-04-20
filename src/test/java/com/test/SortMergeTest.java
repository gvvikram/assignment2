package com.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.main.SortMerge;

public class SortMergeTest {

	ArrayList<Integer> al2;
	ArrayList<Integer> al1=null;
	@Before
	public void setUp()
	{
		al2=new ArrayList<Integer>();
	}
	@Test
	public void test() {
		SortMerge ms=new SortMerge();
		  al1=ms.mergSort(new int[] {1,4,6,8}, new int[]{9,10});
		  al2.add(1);
		  al2.add(4);
		  al2.add(6);
		  al2.add(8);
		  al2.add(9);
		  al2.add(10);
		  assertTrue(al2.equals(al2));
		 
				 
		 
	}

}

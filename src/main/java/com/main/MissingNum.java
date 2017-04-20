package com.main;

import java.util.LinkedList;

public class MissingNum {

	public LinkedList<Integer> findMissingNumbers(int[] a) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int value;
		for (int i = 0; i < a.length; i++)
			for (int j = 1; j < a.length - i; j++)
				if (a[j - 1] > a[j]) {
					a[j - 1] = a[j - 1] + a[j];
					a[j] = a[j - 1] - a[j];
					a[j - 1] = a[j - 1] - a[j];
				}
		for (int j = 0; j < a.length; j++)
			System.out.println(a[j]);
		for (int j = 0; j < a.length - 1; j++) {
			value = a[j];
			while (++value < a[j + 1]) {
				list.add(value);
			}
		}
		
		return list;
	}

}
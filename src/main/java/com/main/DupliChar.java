package com.main;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupliChar {
	public static void main(String[] args) {
		String result = doUniq("vikramvarmag");
		System.out.println(result);

	}

	public static String doUniq(String word) {
		if (word == null) {
			return "Please enter your String";
		} else {
			char[] chars = word.toCharArray();
			Set<Character> charset = new LinkedHashSet<Character>();
			for (char c : chars) {
				charset.add(c);
			}
			StringBuffer str = new StringBuffer();
			for (Character c : charset) {
				str.append(c);
			}
			
			return str.toString();

		}
	}
}

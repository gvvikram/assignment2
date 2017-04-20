package com.main;

public class PalindromeWord {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		boolean flag = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
				flag = false;
				break;
			}
		}
		return flag;

	}
}

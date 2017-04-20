package com.main;

public class PrimeFactor {


	public String primeFactors(int n) {
		String Result = "";
		if (n == 0) {
			Result = "You entered zero";
		}
		if (n == 1) {
			Result = "No prime factors possible for 1";
		} else {
			for (int i = 2; i <= n - 1; i++) {
				if (isPrime(i)) {
					if (n % i == 0) {
						Result += i + " ";
					}
				}
			}
		}
		System.out.println(Result);
		return Result;

	}

	public static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0){
				flag = false;
			break;
			}
		}
		return flag;

	}

}

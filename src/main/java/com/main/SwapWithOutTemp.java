package com.main;

public class SwapWithOutTemp {

	public String  swap(int a,int b){
		if(a==b){
			return "you entered the same values";
		}
		else{
			a=a+b;
			b=a-b;
			a=a-b;
			return a+" "+b;
		}
	}

}

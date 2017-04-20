package com.main;

public class DuplicatArray {
	
	public String duplicate(int[] arr) {

	    int a = arr.length;
	    String Result="";
	    for (int i = 0; i < a; i++) {
	        for (int j = i + 1; j < a; j++) {
	            if (arr[i] == arr[j]) {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < a; k++, shiftLeft++) {
	                    arr[shiftLeft] = arr[k];
	                }
	                a-- ;
	                j-- ;
	            }
	        }
	    }
	    for(int i = 0; i < a; i++){
	       Result+=arr[i]+" ";
	    }
	    System.out.println(Result);
	    return Result;
	}

}

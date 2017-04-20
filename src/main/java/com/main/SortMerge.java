package com.main;
import java.util.ArrayList;
public class SortMerge {

	/*public static void main(String[] args) {
	
	}*/
		public ArrayList<Integer> mergSort(int[] a1,int[] a2)
		{
			int i=0,j=0;
			ArrayList<Integer> ar=new ArrayList<Integer>();
			
		   while(i<a1.length&&j<a2.length)
		   {
			   if(a1[i]<a2[j])
			   {
				   ar.add(a1[i]);
				   i++;
			   }
			   else
			   {
				   ar.add(a2[j]);
				   j++;
				}
				   
		  }
		   while(i<a1.length)
		   {
			   ar.add(a1[i]);
			   i++;
		   }
		   while(j<a2.length)
		   {
			   ar.add(a2[j]);
			   j++;
		   }
		   System.out.println(ar);
		   return ar;
		
				   
				   }
	}
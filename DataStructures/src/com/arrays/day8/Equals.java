package com.arrays.day8;

import java.util.Arrays;

public class Equals {
	public static void main(String[] args) {
		int[] a= {10,20,30};
//		int[] b= {10,20,30};
//		int[] b= {10,20,40};
		int[] b= {20,30,10};
//		int[] b= {10,40,50};
		System.out.println(equals(a,b));
		
		/*Version:-2
		 * 
		 * System.out.println(Arrays.equals(a,b));
		 * 
		 * */
		
		/*
		 * 
		 * Version:-3
		 * ----------
		 * 
		 * Arrays.sort(a);
		 * Arrays.sort(b);
		 * 
		 * System.out.println(Arrays.equals(a,b));  // ---->> Predefined Method
		 * */
		
		
	}
	
	
//	version:-1
	
	
	static boolean equals(int[] a, int[] b) {
		int i;
		for(i=0; i<a.length; i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
	
}

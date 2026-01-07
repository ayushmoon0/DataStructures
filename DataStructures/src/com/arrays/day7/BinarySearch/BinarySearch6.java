package com.arrays.day7.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 			Version-6
 * ::--Binary Search using predefined Method--::
 * 
 * */
public class BinarySearch6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int i, n=input.nextInt();
		int[] a=new int[n];
		System.out.print("Enter array Elements: ");
		for(i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Elements in array: ");
		for(i=0; i<n; i++) {
			System.out.println("a["+i+"]==>>"+a[i]);
		}
		System.out.print("Enter element to Search: ");
		int key=input.nextInt();
		
		System.out.println(Arrays.binarySearch(a, 0, n, key));
		
	}
}

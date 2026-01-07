package com.arrays.day7.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 			Version-5
 * ::--Binary Search to search element in between low and high values--::
 * 
 * */


public class BinarySearchv5 {
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
		System.out.print("Enter start element: ");
		int l=input.nextInt();
		System.out.print("Enter end element: ");
		int h=input.nextInt();
		
		if(binarySearch(a, l, h, key)==-1) {
			System.out.println("Element is not found: "+binarySearch(a, l, h, key));
		}
		else {
			System.out.println("Element Found at Index: "+binarySearch(a, l, h, key));
		}
	}
	static int binarySearch(int[] a, int l, int h, int key) {
		int mid;
		while(l<=h) {
			mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if (a[mid]<key) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return -1;
	}
}

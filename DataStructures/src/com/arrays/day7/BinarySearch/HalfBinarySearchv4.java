package com.arrays.day7.BinarySearch;

/*
 * 			Version-4
 * ::--Binary Search to search from mid of array--::
 * 
 * */



import java.util.Arrays;
import java.util.Scanner;

public class HalfBinarySearchv4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n=input.nextInt();
		int i;
		int[] a=new int[n];
		
		System.out.print("Enter Array Elements: ");
		for(i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.print("Enter key to search: ");
		int key=input.nextInt();
		
		if(binarySearch(a,(a.length-1)/2, n-1,key)==-1) {
			System.out.println("Element not Present: -1");
		}
		else {
			System.out.println("Element present at index: "
					+binarySearch(a,(a.length-1)/2, n-1,key));
		}		
	}
	static int binarySearch(int[] a, int l, int h, int key) {
		int mid;
		while(l<=h) {
			mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]<key) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return -1;
	}
}

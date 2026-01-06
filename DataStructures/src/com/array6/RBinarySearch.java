package com.array6;

import java.util.Arrays;
import java.util.Scanner;

// Binary search using recursion..


public class RBinarySearch {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int n=input.nextInt();
		
		int[] a=new int[n];
		System.out.print("Enter array Elements: ");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		System.out.print("Enter key to search: ");
		int key =input.nextInt();
		
		Arrays.sort(a);
		
		int h=a.length-1;
		int l=0;
		System.out.println("Element Present at Index: "+BinarySearch2(a,l,h,key));
		
		
	}
	
	static int BinarySearch2(int a[],int l, int h, int key) {
		
		if(l<=h) {
			int mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]<key) {
				return BinarySearch2(a,mid+1,h,key);
			}
			else {
				return BinarySearch2(a,l,mid-1,key);
			}
		}
		return -1;
	}
}

package com.array6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array size: ");
		
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.print("Enter key to search: ");
		int key=input.nextInt();
		
		System.out.println("Element found at index: "+BinarySearch1(a, key));
		
	}

	static int BinarySearch1(int a[], int key) {
		int l=0, h=a.length-1, mid;
		
		while(l<=h) {
			mid=(l+h)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]<key) {
				l=mid+1;
			}
			else  {
				h=mid-1;
			}
		}
		return -1;
		
	}
}

package com.array6.BinarySearch;


/*
 * 			Version-1
 * ::--Binary Search to search element in array--::
 * 
 * */
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
		
		System.out.println("Element found at index: "+BinarySearch1(a,0,a.length-1, key));
		input.close();
	}

	static int BinarySearch1(int a[],int l, int h, int key) {
		int mid;
		
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

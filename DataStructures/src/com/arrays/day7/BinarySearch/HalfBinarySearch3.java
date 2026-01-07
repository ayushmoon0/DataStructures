package com.arrays.day7.BinarySearch;


/*
 *     Version-3
 * ::--Binary Search to search from Start of array to mid of Array--::
 * 
 * */
import java.util.Arrays;
import java.util.Scanner;

public class HalfBinarySearch3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int n=input.nextInt();
		int i;
		int[] a=new int[n];
		
		System.out.print("Enter array elements: ");
		for(i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.print("Enter key to search: ");
		int key=input.nextInt();
		
		if(BinarySearch(a,0,a.length-1,key)==-1) {
			System.out.println("Element Not Found: -1");
		}
		else {
			System.out.print("Element found at index: "+BinarySearch(a,0,(a.length-1)/2,key));
		}
		input.close();
	}

	static int BinarySearch(int[] a, int l, int h, int key) {
		// TODO Auto-generated method stub
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

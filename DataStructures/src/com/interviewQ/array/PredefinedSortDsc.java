package com.interviewQ.array;

import java.util.Arrays;
import java.util.Scanner;

public class PredefinedSortDsc {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=input.nextInt();
		
		int[] a=new int[n];
		System.out.print("Enter array Elements: ");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		//Before sorting
		System.out.print("Before sorting: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		
		//After sorting
		System.out.print("\nAfter sorting: ");
		for(int i=n-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		//We don't have predefined method to sort array in asc that's why print in dsc order...
		input.close();
	}
}

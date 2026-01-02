package com.interviewQ.array;

import java.util.Scanner;

public class DscArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array size: ");
		
		int n=input.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter array Elements: ");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		//Before sorting
		System.out.print("Array before sorting: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		
		//Dsc sorting Algorithm
		int t;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		
		//After sorting
		System.out.print("\nArray After sorting: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

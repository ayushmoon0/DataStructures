package com.interviewQ.array;

import java.util.Scanner;

public class AscArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=input.nextInt();
		int[] a=new int[n];
		
		System.out.print("Enter array Elements: ");
		
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		//Before sorting Array: 
		System.out.print("Before sorting Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] +" ");
		}
		
		
		//Sorting algorithm:
		int t;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
			if(a[i]>a[j]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			}
		}
		
		System.out.print("\nAfter sorting Array: ");
		//After sorting Array: 
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

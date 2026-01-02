package com.interviewQ.array;

import java.util.Scanner;

//Program to find 3rd max and 3rd min element present in array..

public class ThirdMaxMin {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array size:");
		int n=input.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<n; i++) {
			a[i]=input.nextInt();
		}
		
		int t;
		for(int i =0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		System.out.println("The 3rd MAX element: "+a[n-3]);
		System.out.println("The 3rd MIN element: "+a[2]);
		input.close();
	}
}

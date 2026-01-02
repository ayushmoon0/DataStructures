package com.interviewQ.array;

import java.util.Scanner;

// Program to find max and min element present in array..


public class MaxMinEle {
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
		
		System.out.println("The MAX element: "+a[n-1]);
		System.out.println("The MIN element: "+a[0]);
		input.close();
	}
}

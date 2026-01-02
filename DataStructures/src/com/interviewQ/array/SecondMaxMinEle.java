package com.interviewQ.array;

import java.util.Scanner;

//Program to find 2nd max and 2nd min element present in array..

public class SecondMaxMinEle {
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
		
		System.out.println("The 2nd MAX element: "+a[n-2]);
		System.out.println("The 2nd MIN element: "+a[1]);
		input.close();
	}
}

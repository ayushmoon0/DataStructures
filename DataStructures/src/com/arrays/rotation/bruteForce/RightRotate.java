package com.arrays.rotation.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {
	static int[] rightRotate(int[] a, int r) {
		r=r%a.length;
		
		int prev, temp;
		for (int i = 0; i < r; i++) {
			prev=a[a.length-1];
			for (int j = 0; j < a.length; j++) {
				temp=a[j];
				a[j]=prev;
				prev=temp;
			}
		}
		return a; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		while(true) {
		System.out.println("Enter no. of rotations: ");
		int r = sc.nextInt();
		System.out.println("Before Rotation==>"+Arrays.toString(a));
		System.out.println("After Rotation==>"+Arrays.toString(rightRotate(a, r)));
		sc.close();
		}
	}
}

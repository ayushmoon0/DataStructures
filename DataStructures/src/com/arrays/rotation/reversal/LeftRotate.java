package com.arrays.rotation.reversal;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
	static void reverse(int[] a, int s, int e) {
		int temp;
		while(s<e) {
			temp=a[s];
			a[s]=a[e];
			a[e]=temp;
			s++;
			e--;
		}
	}
	static int[] leftRotate(int[] a, int r) {
		int n=a.length;
		r=r%n;
		reverse(a,0,r-1);
		reverse(a,r,n-1);
		reverse(a,0,n-1);
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Input Array ==> "+Arrays.toString(a));
		System.out.println("Enter no. of rotations: ");
		int r = sc.nextInt();
		
		System.out.println("After Left Rotation ==> "+Arrays.toString(leftRotate(a,r)));
		sc.close();
	}
}

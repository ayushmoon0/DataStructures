package com.arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	static int[] leftRotate(int[] a, int r) {
		r=r%a.length-1;
		int prev, temp;
		for (int i = 0; i < r; i++) {
			prev=a[0];
			for (int j = a.length-1; j >=0; j--) {
				temp=a[j];			//temp=a[4]=5;
				a[j]=prev;			//a[4]=prev=a[0];
				prev=temp;			//prev=temp=a[4];
			}
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Enter no. of Rotation");
		int r = sc.nextInt();
		System.out.println("Before Rotation==>" +Arrays.toString(a));
		System.out.println("After Rotation==>" +Arrays.toString(leftRotate(a, r)));
		sc.close();
	}
}

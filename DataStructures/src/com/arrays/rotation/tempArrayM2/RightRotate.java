package com.arrays.rotation.tempArrayM2;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {
	static int[] rightRotate(int[] a, int r) {
		int n=a.length;
		r=r%n;
		int[] temp= new int[n];
		
		for (int i = 0; i < n; i++) {
			temp[(i+r)%n]=a[i];
		}
		for (int i = 0; i < n; i++) {
			a[i]=temp[i];
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Input Array ==>"+Arrays.toString(a));
		System.out.println("Enter no. of rotations: ");
		int r = sc.nextInt();
		
		System.out.println("After Right Rotation ==>"+Arrays.toString(rightRotate(a,r)));
		sc.close();
	}
}

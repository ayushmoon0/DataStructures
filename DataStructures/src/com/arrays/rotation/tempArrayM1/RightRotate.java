package com.arrays.rotation.tempArrayM1;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {
	static int[] rightRotate(int[] a, int r) {
		int n=a.length;
		r=r%n;
		int[] temp=new int[r];
		for (int i = 0; i < r; i++) {
			temp[i]=a[n-r+i];
		}
		
		for (int i = n-r-1; i >=0; i--) {
			a[i+r]=a[i];
		}
		
		for (int i = 0; i < r; i++) {
			a[i]=temp[i];
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Before Right Rotation==> "+Arrays.toString(a));
		System.out.println("Enter no. of rotations: ");
		int r = sc.nextInt();
		
		System.out.println("Before Right Rotation==> "+Arrays.toString(rightRotate(a,r)));
		sc.close();
	}
}

package com.arrays.rotation.usingTempVar;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Using Temp Right Rotate: ");
		System.out.println("========================");
		int[] a= {1,2,3,4,5};
		System.out.println("Before right rotation==> "+Arrays.toString(a));
		System.out.println("Enter no. of rotations: ");
		int r = sc.nextInt();
		r=r%a.length;
		for (int i = 0; i < r; i++) {
			int temp=a[a.length-1];
			for (int j = a.length-1; j > 0; j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println("After right rotation==> "+Arrays.toString(a));
		sc.close();
	}
}

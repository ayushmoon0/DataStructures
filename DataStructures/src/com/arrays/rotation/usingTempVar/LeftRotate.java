package com.arrays.rotation.usingTempVar;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array Rotation using Temp Var: ");
		System.out.println("===============================");
		int[] a= {1,2,3,4,5};
		System.out.println("Before Left Rotation==> "+Arrays.toString(a));
		System.out.println("Enter no. of Rotations: ");
		int r = sc.nextInt();
		r%=a.length;
		for(int i=0; i<r; i++) {
			int temp=a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
		System.out.println("After Left Rotation==> "+Arrays.toString(a));
		sc.close();
	}
}

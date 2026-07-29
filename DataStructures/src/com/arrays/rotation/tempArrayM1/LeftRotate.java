package com.arrays.rotation.tempArrayM1;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
	static int[] leftRotate(int[] a, int r) {
		int n=a.length;
		r=r%n;
		int[] temp=new int[r];
		for (int i = 0; i < r; i++) {
			temp[i]=a[i];
		}
		
		for (int i = r; i < n; i++) {
			a[i-r]=a[i];
		}
		
		for (int i = 0; i < r; i++) {
			a[i+n-r]=temp[i];		//a[i+n-r]==> n-r means 5-1=4 so 4 digits are already occupied
		}							//and i'm inserting next digit through 'i'
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Before Rotation: "+Arrays.toString(a));
		System.out.println("Enter no. of rotations: ");
		int r = sc.nextInt();
		
		a=leftRotate(a, r);
		System.out.println("After Left Rotation: "+Arrays.toString(a));
		sc.close();
	}
}

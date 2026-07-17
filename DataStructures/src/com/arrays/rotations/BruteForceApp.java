//02-March-2026
package com.arrays.rotations;

import java.util.Arrays;
import java.util.Scanner;

public class BruteForceApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		
		while(true) {
			System.out.println("Enter choice: \n1.Left Rotation \n2.Right Rotation");
			int key=input.nextInt();
			switch (key) {
			case 1: {
				//Left Rotation
				System.out.println("Input Array: "+Arrays.toString(a));
				System.out.print("Enter no. of Rotations: ");
				int r=input.nextInt();
				System.out.println("Before Left Rotation===>"+Arrays.toString(a));
				Test.rotateLeft(a, r);
				System.out.println("After Left Rotation ===>"+Arrays.toString(a));
				System.out.println("==============================\n");
				break;
			}
			case 2: {
				//2.Right Rotation
				System.out.println("Input Array: "+Arrays.toString(a));
				System.out.print("Enter no. of Rotations: ");
				int r=input.nextInt();
				System.out.println("Before Right Rotation===>"+Arrays.toString(a));
				Test.rotateRight(a, r);
				System.out.println("After Right Rotation ===>"+Arrays.toString(a));
				System.out.println("==============================\n");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
		}
	}
}

class Test{
	static int[] rotateLeft(int a[], int r) {
		r=r%a.length;
		int temp, prev, i,j;
		for (i = 0; i <r; i++) {
			prev=a[0];
			for (j = a.length-1; j>=0; j--) {
				temp=a[j];
				a[j]=prev;
				prev=temp;
			}
		}
		return a;
	}
	static int[] rotateRight(int a[], int r) {
		r=r%a.length;
		int temp, prev, i, j;
		for(i=0; i<r; i++) {
			prev=a[a.length-1];
			for(j=0; j<a.length; j++) {
				temp=a[j];
				a[j]=prev;
				prev=temp;
			}
		}
			return a;
	}
}

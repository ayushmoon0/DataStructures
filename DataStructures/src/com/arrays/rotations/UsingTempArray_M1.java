package com.arrays.rotations;

import java.util.Arrays;
import java.util.Scanner;

public class UsingTempArray_M1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Input Array: "+Arrays.toString(a));
		System.out.print("Enter no. of Rotation: ");
		int r=input.nextInt();
//		System.out.println("Before Left-Rotation===> "+Arrays.toString(a));
//		Demo1.rotateLeftTemp(a, r);
//		System.out.println("After Left-Rotation====> "+Arrays.toString(a));
		
		System.out.println("Before Right-Rotation==> "+Arrays.toString(a));
		Demo1.rotateRightTemp(a, r);
		System.out.println("After Right-Rotation===> "+Arrays.toString(a));
		input.close();
	}
}

class Demo1{
	static int[] rotateLeftTemp(int[] a, int r) {
		r=r%a.length;
		int i,n=a.length;
		int[] temp=new int[r];
		
		for(i=0;i<r;i++) {
			temp[i]=a[i];
		}
		
		for(i=r;i<n;i++) {
			a[i-r]=a[i];
		}
		
		for(i=0;i<r;i++) {
			a[i+n-r]=temp[i];
		}
		
		return a;
	}
	static int[] rotateRightTemp(int[] a, int r) {
		r=r%a.length;
		int i,n=a.length;
		int[] temp = new int[r];
		for(i=0;i<r;i++) {
			temp[i]=a[n-r+i];
		}
		
		for(i=n-r-1;i>=0;i--) {
			a[i+r]=a[i];
		}
		
		for(i=0;i<r;i++) {
			a[i]=temp[i];
		}
		return a;
	}
}
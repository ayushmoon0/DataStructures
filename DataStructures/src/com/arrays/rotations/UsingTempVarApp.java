package com.arrays.rotations;

import java.util.Arrays;
import java.util.Scanner;
	
public class UsingTempVarApp {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		System.out.println("Input Array: "+Arrays.toString(a));
		System.out.print("Enter no. of Rotations: ");
		int r=input.nextInt();
		//Left-Rotation
//		System.out.println("Before Left-Rotation===>"+Arrays.toString(a));
//		Demo.rotateLeftTemp(a,r);
//		System.out.println("After Left-Rotation ===>"+Arrays.toString(a));
		
		//Right Rotation
		System.out.println("Before Right-Rotation===>"+Arrays.toString(a));
		Demo.rotateRightTemp(a,r);
		System.out.println("After Right-Rotation ===>"+Arrays.toString(a));
		input.close();		
	}
}

class Demo{
	static int[] rotateLeftTemp(int[] a, int r) {
		r=r%a.length;
		int temp, i, j;
		for(i=0;i<r;i++) {
			temp=a[0];
			for(j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		return a;
	}
	static int[] rotateRightTemp(int[] a, int r) {
		r=r%a.length;
		int temp, i, j;
		for(i=0;i<r;i++) {
			temp=a[a.length-1];
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		return a;
	}
}

	package com.arrays.day8;

import java.awt.im.InputContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class InsertIndex {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a= {2,4,3,5,6};
		System.out.println(Arrays.toString(a));
//		System.out.println("Enter a new Element to insert at Last: ");
//		int last=input.nextInt();	
//	
//		System.out.println(Arrays.toString(insertAtLast(a, last)));
		
		
//		System.out.println("Enter a new Element to insert at First: ");
//		int first=input.nextInt();
//		System.out.println(Arrays.toString(insertAtFirst(a, first)));
		
		
		System.out.println("Enter a new Element: ");
		int ele=input.nextInt();
		
		System.out.println("Enter index number: ");
		int index=input.nextInt();
		System.out.println(Arrays.toString(insertAtIndex(a,ele, index)));
		
	}
	
	static int[] insertAtLast(int[] a, int n) {
		int i;
		int b[]=new int[a.length+1];
		for(i=0; i<a.length; i++) {
			b[i]=a[i];
		}
		b[i]=n;
		return b;
	}
	
	static int[] insertAtFirst(int[] a, int n) {
		int i; int[] b=new int[a.length+1];
		
		b[0]=n;
		for (i=0; i<a.length; i++) {
			b[i+1]=a[i];
		}
		
		return b;
	}
	
	static int[] insertAtIndex(int[] a, int ele,int index) {
		int i, b[]=new int[a.length+1];
		int k=0;
		
		for(i=0; i<index; i++) {
			b[k++]=a[i];
		}
		b[k++]=ele;
		for(i=index; i<a.length; i++) {
			b[k++]=a[i];
		}
		
		return b;
	}
}

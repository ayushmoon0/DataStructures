package com.matrix;

import java.util.Scanner;

public class SwapTwoRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Details: ");
		System.out.println("Row size: ");
		int row = sc.nextInt();
		System.out.println("Column Size: ");
		int col = sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("Enter Matrix Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter m and n value: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Before Swapping..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int temp;
		//Logic
		for (int i = 0; i < row; i++) {
			temp=a[m-1][i];
			a[m-1][i]=a[n-1][i];
			a[n-1][i]=temp;
		}
		
		System.out.println("\nAfter Swapping..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

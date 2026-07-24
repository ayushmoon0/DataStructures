package com.matrix;

import java.util.Scanner;

public class SwapTowCol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix Details: ");
		System.out.println("Row size: ");
		int row = sc.nextInt();
		System.out.println("Col size: ");
		int col = sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("Enter Matrix Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter two cols to swap: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Before swaping..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//logic
		for (int i = 0; i < n; i++) {
			int t=a[i][m-1];
			a[i][m-1]=a[i][n-1];
			a[i][n-1]=t;
		}
		
		System.out.println("\nAfter swaping..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

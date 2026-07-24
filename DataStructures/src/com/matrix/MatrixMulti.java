package com.matrix;
//Two Matrix Multiplication

import java.util.Scanner;

public class MatrixMulti {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Matrix-A details: ");
		System.out.println("Row size: ");
		int rsize1 = input.nextInt();
		System.out.println("Column size: ");
		int csize1 = input.nextInt();
		int[][] a=new int[rsize1][csize1];
		System.out.println("Enter Elements: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < csize1; j++) {
				a[i][j]=input.nextInt();
			}
		}
		System.out.println("\nMatrix-A: ");
		System.out.println("---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < csize1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter Matrix-B details: ");
		System.out.println("Row size: ");
		int rsize2 = input.nextInt();
		System.out.println("Column size: ");
		int csize2 = input.nextInt();
		int[][] b=new int[rsize2][csize2];
		System.out.println("Enter Elements: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < csize2; j++) {
				b[i][j]=input.nextInt();
			}
		}
		System.out.println("\nMatrix-B: ");
		System.out.println("---------");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < csize2; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int[][] c=new int[rsize1][csize1];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < csize1; j++) {
				c[i][j]=0;
				for (int k = 0; k < csize1; k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("\nMatrix-C: ");
		System.out.println("---------");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < csize1; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		input.close();
	}
}

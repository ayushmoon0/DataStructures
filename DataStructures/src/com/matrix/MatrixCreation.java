package com.matrix;

import java.util.Scanner;

public class MatrixCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix-A Details: ");
		System.out.println("Enter Row size: ");
		int rsize1 = sc.nextInt();
		System.out.println("Enter Column size: ");
		int csize1 = sc.nextInt();	
		int[][] A=new int[rsize1][csize1];
		System.out.println("Enter the elements: ");
		for (int i = 0; i <A.length; i++) {
			for (int j = 0; j < csize1; j++) {
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix-A: ");
		System.out.println("----------");
		for (int i = 0; i < A.length; i++) {
			 for (int j = 0; j < csize1; j++) {
				System.out.print(A[i][j]+" ");
			}
			 System.out.println();
		}
		System.out.println("Matrix-B Details: ");
		System.out.println("Enter Row size: ");
		int rsize2 = sc.nextInt();
		System.out.println("Enter Column size: ");
		int csize2 = sc.nextInt();	
		int[][] B=new int[rsize2][csize2];
		System.out.println("Enter the elements: ");
		for (int i = 0; i <A.length; i++) {
			for (int j = 0; j < csize2; j++) {
				B[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix-B: ");
		System.out.println("----------");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < csize2; j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

//Input: 
//1 2 3 
//4 5 6
//7 8 9
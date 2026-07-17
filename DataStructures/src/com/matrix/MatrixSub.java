package com.matrix;

import java.util.Scanner;

public class MatrixSub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix-A Details: ");
		System.out.println("Row size: ");
		int rsize1 = sc.nextInt();
		System.out.println("Column size: ");
		int csize1 = sc.nextInt();
		int[][] A=new int[rsize1][csize1];
		System.out.println("Enter Matrix Elments: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < csize1; j++) {
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix-A");
		System.out.println("--------");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < csize1; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nEnter Matrix-B Details: ");
		System.out.println("Row size: ");
		int rsize2 = sc.nextInt();
		System.out.println("Column size: ");
		int csize2 = sc.nextInt();
		int[][] B=new int[rsize2][csize2];
		System.out.println("Enter Matrix Elments: ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < csize2; j++) {
				B[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nMatrix-B");
		System.out.println("--------");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < csize2; j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		if(rsize1==rsize2 && csize1==csize2) {
			int[][] C=new int[rsize1][rsize1];
			for (int i = 0; i < C.length; i++) {
				for (int j = 0; j < csize1; j++) {
					 C[i][j]=A[i][j]-B[i][j];
				}
			}
			System.out.println("\nMatrix-C");
			System.out.println("--------");
			for (int i = 0; i < C.length; i++) {
				for (int j = 0; j < csize1; j++) {
					System.out.print(C[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("Both matrix size should be same.. lol:)!!");
		}
		sc.close();
	}
}

//Inputs: 
//Matrix-A
//1 2 
//3 4 
//5 6 
//Matrix-B
//4 4 
//5 5 
//6 6 

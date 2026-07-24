package com.matrix;

import java.util.Scanner;

public class MatrixEleSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Details: ");
		System.out.println("Row size: ");
		int rsize = sc.nextInt();
		System.out.println("Coloum size: ");
		int csize = sc.nextInt();
		int[][] a=new int[rsize][csize];
		System.out.println("Enter matrix Elements: ");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				sum+=a[i][j];
			}
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}
}

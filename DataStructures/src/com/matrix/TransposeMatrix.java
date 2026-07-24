package com.matrix;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Details: ");
		System.out.println("Row Size: ");
		int rsize = sc.nextInt();
		System.out.println("Column size: ");
		int csize = sc.nextInt();
		int[][] a=new int[rsize][csize];
		System.out.println("Enter Matrix Elements: ");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Normal Matrix: ");
		System.out.println("---------------");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nTranspose Matrix: ");
		System.out.println("-----------------");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

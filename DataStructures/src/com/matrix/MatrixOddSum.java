package com.matrix;

import java.util.Scanner;

public class MatrixOddSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Details: ");
		System.out.println("Enter row size: ");
		int rsize = sc.nextInt();
		System.out.println("Enter column size: ");
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
				if(a[i][j]%2!=0) {
					sum+=a[i][j];
				}
				else {
					continue;
				}
			}
			
		}
		System.out.println("Odd element Sum = "+sum);
		sc.close();
	}
}

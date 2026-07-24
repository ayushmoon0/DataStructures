package com.matrix;

import java.util.Scanner;

public class SumDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix Details: ");
		System.out.println("Row size: ");
		int row = sc.nextInt();
		System.out.println("Col size: ");
		int col = sc.nextInt();
		int[][] a= new int[row][col];
		System.out.println("Enter matrix Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Before Swapping");
		for (int i = 0; i <row ; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//Logic
		int sum=0;
		for (int i = 0; i <row ; i++) {
			for (int j = 0; j < col; j++) {
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		
		System.out.println("Sum of diagonal="+sum);
		sc.close();
	}
}

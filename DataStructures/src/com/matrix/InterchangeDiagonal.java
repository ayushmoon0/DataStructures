package com.matrix;

import java.util.Scanner;

public class InterchangeDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix Details: ");
		System.out.println("Row Size: ");
		int row = sc.nextInt();
		System.out.println("Col size: ");
		int col = sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("Enter matrix Elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//Logic
		for (int i = 0; i < row; i++) {
				int temp=a[i][i];
				a[i][i]=a[i][row-i-1];
				a[i][row-i-1]=temp;
		}
		System.out.println("\nInterchanged Diagonal: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

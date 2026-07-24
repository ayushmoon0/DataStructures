package com.matrix;

import java.util.Scanner;

public class RowWiseSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Details: ");
		System.out.println("Row size: ");
		int rsize = sc.nextInt();
		System.out.println("Column Size: ");
		int csize = sc.nextInt();
		int[][] a=new int[rsize][csize];
		System.out.println("Enter Matrix Elements: ");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				a[i][j]=sc.nextInt();				
			}
		}
		
		for (int i = 0; i < rsize; i++) {
			int sum=0;
			for (int j = 0; j < csize; j++) {
				sum+=a[i][j];				
			}	
			System.out.println("Row-"+(i+1)+" :Sum = "+sum);
		}
		sc.close();
	}
}

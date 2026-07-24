package com.matrix;

import java.util.Scanner;

class Demo{
	static boolean checkIdentity(int a[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(i!=j && a[i][j]!=0) {   //--->> this means, all the conditions like
											   //		(0,1),  (0,2)
					return false;			   //(1,0),      ,  (1,2)
					}						   //(2,1), (2,1), 			--are not 0 return false
				
				else if(i==j && a[i][j]!=1) {	//--->> this means, all the conditions like
											//(1,1) (2,2) (3,3) --->> must be '1'
					return false;
				}
			}
		}
		return true;
	}
}
public class CheckIdentityMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix Details: ");
		System.out.println("Row size: ");
		int rsize = sc.nextInt();
		System.out.println("Col size: ");
		int csize = sc.nextInt();
		int[][] a=new int[rsize][csize];
		System.out.println("Enter Matrix Elements: ");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(Demo.checkIdentity(a, rsize, csize));
		sc.close();
	}
}

//input
//1 0 0
//0 1 0
//0 0 1

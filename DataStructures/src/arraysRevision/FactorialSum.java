package arraysRevision;

import java.util.Scanner;

public class FactorialSum {
	static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size= input.nextInt();
		int[] a=new int[size];
		int sum=0;
		
		System.out.println("Enter array Elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			sum+=factorial(a[i]);
		}
		
		System.out.println("Sum of All Number Factorial: "+sum);
		input.close();
	}
}

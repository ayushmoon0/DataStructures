package arrays;

import java.util.Scanner;

public class PrimeEleSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array");
		int size=input.nextInt();
		
		int[] a=new int[size];
		int sum=0;
		
		System.out.print("Enter array elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		for(int i=0; i<size; i++) {
				if(isPrime(a[i])) {
					sum+=a[i];
				}			
		}
		System.out.println("Sum of Prime numbers: "+sum);
		input.close();
	}
	
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}

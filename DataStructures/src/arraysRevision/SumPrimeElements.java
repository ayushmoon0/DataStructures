package arraysRevision;

import java.util.Scanner;

public class SumPrimeElements {
	static int primeNumber(int n) {
		int factor=0;
		for(int i=1; i<=n; i++)
			if(n%i==0)
				factor++;
		return factor;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=input.nextInt();
		int[] a=new int[size];
		int sum=0;
		
		System.out.print("Enter array Elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.println("Array Elements: ");
		for(int i=0; i<size; i++)
			System.out.println(a[i]+" ");
		
		for(int i=0; i<size; i++)
			if(primeNumber(a[i])==2) {
				sum+=a[i];
			}
				
		System.out.println("Sum of Prime Elements: "+sum);
		input.close();
	}
}

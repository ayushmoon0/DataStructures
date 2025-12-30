package arrays;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int size=input.nextInt();
		int[] a=new int[size];
		int sum=0;
		
		System.out.print("Enter elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		for(int i=0; i<size;i++) {
			sum+=a[i];
		}
		System.out.print("The sum of array Elements: "+sum);
		input.close();
	}
}

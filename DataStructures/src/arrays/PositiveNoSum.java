package arrays;

import java.util.Scanner;

public class PositiveNoSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=input.nextInt();
		int[] a=new int[size];
		int sum=0;
		
		System.out.print("Enter array elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		for(int i=0; i<size; i++) {
			if(a[i]>0) {
				sum+=a[i];
			}
		}
		
		System.out.println("Sum of Present +ve nos: "+sum);
		input.close();
	}
}

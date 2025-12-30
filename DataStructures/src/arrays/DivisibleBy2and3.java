package arrays;

import java.util.Scanner;

public class DivisibleBy2and3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=input.nextInt();
		int[] a=new int[size];
		int sum=0;
		
		System.out.print("Enter array Elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		for(int i=0; i<size; i++) {
			if(a[i]%2==0 && a[i]%3==0) {
				sum+=a[i];
			}
		}
		System.out.println("Sum of Elements divisible by 2 and 3: "+sum);
		input.close();
	}
}

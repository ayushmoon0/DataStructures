package arrays;

import java.util.Scanner;

public class EvenElementSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=input.nextInt();
		int sum=0;
		
		int[] a=new int[size];
		System.out.println("Enter array Elements: ");
		
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
		}
		System.out.println("The sum of present even nos. are: "+sum);
		input.close();
	}
}

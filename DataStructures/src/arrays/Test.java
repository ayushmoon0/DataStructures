package arrays;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = input.nextInt();
		int u=0;
		
		int a[] = new int[size];
		
		System.out.print("Enter "+size+" elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		System.out.println("Array elemets using for loop: ");
		for(int i=0; i<size; i++) {
			System.out.println("Element "+i+": "+"\t"+"a"+"["+i+"]= "+a[i]);
		}
		
		System.out.println("Array elements using while loop: ");
		while(u<size) {
			System.out.println("Element "+u+": "+"\t"+"a"+"["+u+"]= "+a[u]);
			u++;
		}
		
		System.out.println("Array elemets using for each: ");
		for(int i: a) {
			System.out.println(i);
		}
	}
}

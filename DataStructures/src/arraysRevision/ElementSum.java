package arraysRevision;

import java.util.Scanner;

public class ElementSum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int size=input.nextInt();
		int sum=0;
		
		int[] a=new int[size];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.print("Elements inside Array: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		for(int i=0; i<size; i++)
			sum+=a[i];
		System.out.println("Total Elements Sum= "+sum);
		input.close();
	}
}

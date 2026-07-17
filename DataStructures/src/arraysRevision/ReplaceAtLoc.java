package arraysRevision;

import java.util.Scanner;

public class ReplaceAtLoc {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size=input.nextInt();
		
		int[] a=new int[size];
		System.out.print("Enter "+size+" elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.print("Array Elements: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
	
		System.out.print("\nEnter Index location: ");
		int index=input.nextInt();
		
		System.out.print("Enter New Element: ");
		int newe =input.nextInt();
		
		System.out.print("Before updation: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		
		for(int i=0; i<size; i++)
			if(i==index)
				a[i]=newe;
		
		System.out.print("\nAfter updation: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		input.close();
	}
}

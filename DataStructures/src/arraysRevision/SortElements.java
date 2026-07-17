package arraysRevision;

import java.util.Scanner;

public class SortElements {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int size=input.nextInt();
		System.out.println("Enter "+size+" Elements: ");
		int[] a=new int[size];
		
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.println("Array Elements: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		
		//Sorting Logic For Ascending: 
		int temp;
		/*
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nSorted in ASC order: ");
		*/
		
		//Sorting Logic For Descending: 
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\nSorted in DSC order: ");
		System.out.println("Array Elements: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		input.close();
	}
}

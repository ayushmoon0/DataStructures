package arraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class SortPredefined {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size=input.nextInt();
		
		int[] a=new int[size];
		System.out.println("Enter "+size+" elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.println("Before Sorting: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		
		Arrays.sort(a);    //------> Predefined Sorting Method
		
		System.out.println("After Sorting: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

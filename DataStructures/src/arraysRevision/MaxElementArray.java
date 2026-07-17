package arraysRevision;

import java.util.Scanner;

public class MaxElementArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.println("Array Elements: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		
		int max=a[0];;
		for(int i=1; i<size; i++) {
			if(max<a[i])
				max=a[i];
		}
		System.out.println();
		System.out.println("Maximum Element: "+max);
			
		input.close();
			
	}
}

package arrays.day3;

import java.util.Scanner;

public class IndexReplace {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size=input.nextInt();
		
		int[] a=new int[size];
		System.out.print("Enter array elements: ");
		
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		System.out.print("Enter an index to replace value: ");
		 int index=input.nextInt();
		
		System.out.print("Enter new Element: ");
		int newe=input.nextInt();
		
		System.out.print("Before updation array elements are: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		
		a[index]=newe;
		System.out.println();
		
		
		System.out.print("After updation array elements are: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

package arraysRevision;

import java.util.Scanner;

public class UpdateSecondOcurrence {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("Enter array Elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.println("Array Elements: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		
		int olde, newe;
		System.out.println();
		System.out.println("Enter old element: ");
		olde=input.nextInt();
		System.out.println("Enter new element: ");
		newe=input.nextInt();
		
		System.out.print("Before Updation Array: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		int counter=0;
		for(int i=0; i<size; i++) {
			if(a[i]==olde) {
				counter++;
				if(counter==2) {
					a[i]=newe;
				}
			}
		}
		
		System.out.println();
		System.out.print("After Updation Array: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

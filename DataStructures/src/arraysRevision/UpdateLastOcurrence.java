package arraysRevision;

import java.util.Scanner;

public class UpdateLastOcurrence {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size=input.nextInt();
		int[] a=new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.print("Array Elements: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		
		System.out.println();
		System.out.print("Enter old element: ");
		int olde=input.nextInt();
		System.out.print("Enter new element: ");
		int newe =input.nextInt();
		System.out.print("Before updation: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=size-1; i>=0; i--) {
			if(a[i]==olde) {
				a[i]=newe;
				break;
			}
		}
		System.out.println();
		System.out.print("After updation: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

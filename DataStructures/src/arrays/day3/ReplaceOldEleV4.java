package arrays.day3;


//update last occurrence of repeated element in array


import java.util.Scanner;

public class ReplaceOldEleV4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter size of Array: ");
		int size=input.nextInt();
		int[] a=new int[size];
		
		System.out.print("Enter array elements: ");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		int olde, newe;
		
		System.out.print("Enter old element: ");
		olde=input.nextInt();
		System.out.print("Enter new element: ");
		newe=input.nextInt();
		
		System.out.print("Before array update: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=a.length-1; i>=0; i++) {
			if(a[i]==olde) {
				a[i]=newe;
				break;
			}
		}
		
		System.out.print("After array update: ");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		input.close();
	}
}

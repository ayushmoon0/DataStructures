package arraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
	static int binarySearchFirstHalf(int[] a, int key) {
		int low=0, high=(a.length-1)/2;
		int mid=(low+high)/2;
		
		for(int i=0; i<(a.length-1)/2; i++) {
			if(a[i]==key) {
				return i;
			}
			else if(a[i]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	static int binarySearchSecondHalf(int[] a, int key) {
		int low=(a.length)/2, high=a.length-1;
		int mid=(low+high)/2;
		
		for(int i=(a.length)/2; i<a.length; i++) {
			if(a[i]==key) {
				return i;
			}
			else if(a[i]<key) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a= {12,34,1,2,32,56,6,9,55};
		
		Arrays.sort(a);
		
		System.out.println("After sorting: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nEnter Key to Search in First half: ");
		int key=input.nextInt();
	
		System.out.println(key+" Found at Index -->> "+BinarySearch1.binarySearchFirstHalf(a, key));
		System.out.println("\nEnter key to Search in Second half: ");
		key=input.nextInt();
		System.out.println(key+" Found at Index -->> "+BinarySearch1.binarySearchSecondHalf(a, key));
		
		input.close();
	}
}

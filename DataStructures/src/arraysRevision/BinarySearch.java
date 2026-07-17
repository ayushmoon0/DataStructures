package arraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int[] a, int key) {
		int high=a.length-1, low=0;
		int mid;
		for(int i=0; i<a.length; i++) {
			mid=(low+high)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if(key>a[mid]) {
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
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\n\nEnter Key Element to Search: ");
		int key=input.nextInt();
		
		System.out.println("Index of "+key+" -->> "+BinarySearch.binarySearch(a, key));
		
		input.close();
	}
}

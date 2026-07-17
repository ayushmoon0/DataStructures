package arraysRevision;

import java.util.Arrays;

public class SecMaxMin {
	public static void main(String[] args) {
		int[] a= {10,3,6,1,99,5,2};
		
		Arrays.sort(a);
		System.out.println("After Sorting: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\n\n2nd Minimum -->> "+a[1]);
		System.out.println("2nd Maximum -->> "+a[a.length-2]);
		
		System.out.println("\n3rd Minimum -->> "+a[2]);
		System.out.println("3rd Maximum -->> "+a[a.length-3]);
	}
}

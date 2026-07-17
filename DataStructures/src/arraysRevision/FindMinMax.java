package arraysRevision;

import java.util.Arrays;

public class FindMinMax {
	public static void main(String[] args) {
		int[] a= {10,9,4,11,15,7};
		Arrays.sort(a);
		
		System.out.println("After sorting: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("\n\nMinimum Element -->> "+a[0]);
		System.out.println("Maximum Element -->> "+a[a.length-1]);
			
	}
}

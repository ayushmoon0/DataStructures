package arraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class ElementDeletion {
	static int[] deleteElementAtLoc(int[] a, int loc) {
		int[] b=new int[a.length-1];
		int k=0;
		for(int i=0; i<a.length; i++) {
			if(i==loc)
				continue;
			b[k++]=a[i];
		}
		return b;
	}
	
	static int[] deleteAll(int[] a) {
		int[] b=new int[0];
		return b;
	}
	
	static int[] deleteElement(int[] a, int ele) {
		int index=-1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==ele) {
				index=i;
				break;
			}
		}
		int[] b=new int[a.length-1];
		int k=0;
		if(index!=-1) {
		for(int i=0; i<a.length; i++) {
				if(a[i]==ele) {
					continue;
				}
				b[k++]=a[i];
			}
			return b;
		}
		return a;
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a= {12,3,54,13,7,90,47,34};
		Arrays.sort(a);
		
		System.out.print("Before Deletion: ");
		System.out.println(Arrays.toString(a));
		System.out.print("\nEnter location to Delete: ");
		int loc=input.nextInt();
		
		
		System.out.print("\nAfter Deletion: ");
		System.out.println(Arrays.toString(ElementDeletion.deleteElementAtLoc(a, loc)));
		
		System.out.print("\nAfter deleting All: ");
		System.out.println((Arrays.toString(ElementDeletion.deleteAll(a))));
		
		System.out.print("\nBefore Deletion: ");
		System.out.println(Arrays.toString(a)+"\n");
		System.out.print("Enter Element to delete: ");
		int del=input.nextInt();
		System.out.print("\nAfter Deletion: ");
		System.out.println(Arrays.toString(ElementDeletion.deleteElement(a, del)));
		
		input.close();
	}
}

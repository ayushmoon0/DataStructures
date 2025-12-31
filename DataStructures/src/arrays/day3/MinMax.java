package arrays.day3;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = input.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0; i<size; i++) {
			a[i]=input.nextInt();
		}
		
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		
		for(int i=0; i<a.length; i++) {
			if(min>a[i])
				min=a[i];
		}
		
		System.out.println("Max Element: "+max);
		System.out.println("Min Element: "+min);
		input.close();
	}
}

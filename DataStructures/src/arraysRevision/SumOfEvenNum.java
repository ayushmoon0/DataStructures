package arraysRevision;

import java.util.Scanner;

public class SumOfEvenNum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size =input.nextInt();
		int sum=0;
		
		int[] a=new int[size];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.println("Elements inside Array: ");
		for(int i=0; i<size; i++)
			System.out.println(a[i]+" ");
		
		for(int i=0; i<size; i++)
			if(a[i]%2==0)
				sum+=a[i];
		
		System.out.println("Even element Sum= "+sum);
		input.close();
	}
}

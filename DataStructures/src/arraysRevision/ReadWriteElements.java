package arraysRevision;

import java.util.Scanner;

public class ReadWriteElements {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array size:");
		int size=input.nextInt();
		int a[] =new int[size];
		
		System.out.println("Enter "+size+" Elements..");
		for(int i=0; i<size; i++)
			a[i]=input.nextInt();
		
		System.out.print("Array elements: ");
		for(int i=0; i<size; i++)
			System.out.print(a[i]+" ");
		
		input.close();
	}
}

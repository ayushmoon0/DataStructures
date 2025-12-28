package recursion;
import java.util.Scanner;

class test{
	static void meth1(int n) {
		if(n>=1) {
			meth1(n-1); 
			System.out.println(n+" ");
		}
	}
}

class printNum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		test.meth1(n);
	}
}
package recursion;
import java.util.Scanner;

class test1{
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+sum(n-1);
		}
		
	}
}


public class Rsum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		System.out.println(test1.sum(n));
	}
}

package recursion;
import java.util.Scanner;

class test3{
	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else 
			return n*fact(n-1);
	}
	
}
public class Rfact {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		System.out.println(test3.fact(n));
	}
}

package recursion;
import java.util.Scanner;

class Test6{
	static int sumOfDigits(int n) {
		if(n==0)
			return 0;
		else {
			return (n%10)+ sumOfDigits(n/10);
		}
	}
}
public class RsumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		System.out.println(Test6.sumOfDigits(n));
	}
}

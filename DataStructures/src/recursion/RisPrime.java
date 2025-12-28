package recursion;
import java.util.Scanner;

class Test5{
	static boolean isPrime(int n, int i) {
		if(i==1) {
			return true;
		}
		else if(n%i==0) {
			return false;
		}
		else return isPrime(n,--i);
	}
}
public class RisPrime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		System.out.println(Test5.isPrime(n, n/2));
	}
}

package recursion;
import java.util.Scanner;
class test2{
	static int power(int a, int b) {
		if(b>=1) {
			return a*power(a,b-1);
		}
		else 
			return 1;
	}
}


public class Rpower {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b values: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Result: "+test2.power(a,b));
	}
}

package recursion;
import java.util.Scanner;

class test4{
	static int product(int a, int b) {
		if(a<b) {
			return product(b,a);
		}
		else if(b!=0) {
			return a+product(a,b-1);
		}
		else return 0;
	}
}
public class Rproduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values of a,b: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(test4.product(a, b));
		
	}
}

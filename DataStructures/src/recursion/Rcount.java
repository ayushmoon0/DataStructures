package recursion;
import java.util.Scanner;

class Test8{
	static int c;
	static int count(int n) {
		if(n!=0) {
			c++;
			count(n/10);
		}
		return c;
	}
}
public class Rcount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= input.nextInt();
				
		System.out.println(Test8.count(n));
	
	}
}

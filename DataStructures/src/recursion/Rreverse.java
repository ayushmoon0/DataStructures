package recursion;
import java.util.Scanner;

class Test7{
	static int reverse(int n, int len) {
		if(n==0) {
			return 0;
		}
		else
		{
			return (n%10)*(int)Math.pow(10, len-1) + reverse(n/10,--len);
		}
	}
}
public class Rreverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		String n = input.nextLine();
		System.out.println(Test7.reverse(Integer.parseInt(n),n.length()));
	}
}

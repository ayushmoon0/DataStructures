package recursion;
import java.util.*;

public class Fibonacci {
	
	public static void main(String[] args) {
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int a = 0, b=1, c;
		ArrayList<Integer> obj = new ArrayList<>();
		
		obj.add(a);
		obj.add(b);
		for (int i = 0; i <=n-2; i++) {
			c=a+b;
			obj.add(c);
			a=b;
			b=c;
		}
		System.out.println(obj);
		}
	}
}

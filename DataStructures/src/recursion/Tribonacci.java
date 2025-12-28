package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class Tribonacci {
	
	public static void main(String[] args) {
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int a = 0, b=1, c=2, d;
		ArrayList<Integer> obj = new ArrayList<>();
		
		obj.add(a);
		obj.add(b);
		obj.add(c);
		for (int i = 0; i <=n-2; i++) {
			d=a+b+c;
			obj.add(d);
			a=b;
			b=c;
			c=d;
		}
		System.out.println(obj);
		}
	}
}
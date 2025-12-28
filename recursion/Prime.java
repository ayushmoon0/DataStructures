package recursion;
import java.util.Scanner;

class One{
	static void meth1(int n) {
		int fact = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0)
				fact++;
		}
		
		if(fact==2)
			System.out.println("Yes.!! It is Prime");
		else
			System.out.println("No.!! It is not Prime");
	}
	
	
	static boolean meth2(int n, int i) {
		if(i==1)
			return true;
		else if(n%i==0)
			return false;
		else 
			return meth2(n,--i);
		}
	}


public class Prime {
	public static void main(String[] args) {
		while(true) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		
//		One.meth1(n);
		if(One.meth2(n,n/2)==true)
			System.out.println("It is Prime.!!");
		else 
			System.out.println("It is not Prime.!!");
		
		}
		
	}
	
	
}

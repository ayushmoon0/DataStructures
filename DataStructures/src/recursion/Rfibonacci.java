package recursion;
import java.util.Scanner;


class Test10{
	static int fibonacci(int n) {
			if(n==0 || n==1)
				return n;
			else {
				return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}

public class Rfibonacci {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter nth position: ");
	
	int n = input.nextInt();
	
//	for (int i = 0; i <= n; i++) {
//		if(i==0 || i==1)
//			System.out.print(i+" ");
//		else {
//			System.out.print((i-1)+(i-2)+" ");
//		}
//	}
	System.out.println(Test10.fibonacci(n));
	input.close();
}
}


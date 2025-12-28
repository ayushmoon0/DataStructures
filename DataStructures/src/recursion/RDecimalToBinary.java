package recursion;
import java.util.Scanner;

class Test9{
	static int DciToBin(int n) {
		if(n==0)
			return 0;
		else {
			return (n%2)+10*DciToBin(n/2);
		}
	}
	static void DciToBin2(int n) {
		if(n!=0) {
			DciToBin2(n/2);
			System.out.print(n%2);
		}
	}
}
public class RDecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = input.nextInt();
		
//		System.out.println(Test9.DciToBin(n));
		Test9.DciToBin2(n);
		input.close();
	}
}

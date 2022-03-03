import java.util.Scanner;

public class Fibonacci {
	
	static int fib(int n)
	{
		if(n<=1)
			return n;
		
		//System.out.println(n);
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter any number");
		int input = x.nextInt();

		System.out.println(fib(input));
		

	}

}

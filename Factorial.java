import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		if (n <= 1)
			return n;

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		System.out.println("Enter any number");
		int input = x.nextInt();

		System.out.println(factorial(input));
	}

}

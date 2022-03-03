import java.util.Scanner;

public class Printing_series_forward_And_backward {

	static void print(int n, int Limit) {
		if (n <= 0) // returning if n is a negative
			return;

		if (n > Limit)
			return;

		System.out.print(n + " ");
		print(n * 2, Limit);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = x.nextInt();
		System.out.println("Enter the limt");
		int limit = x.nextInt();
		print(input, limit);

	}

}

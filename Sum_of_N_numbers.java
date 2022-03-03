import java.util.Scanner;

public class Sum_of_N_numbers {
	static int sum(int n) {
		if (n <= 1)
			return n;

		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter any number");
		int input = x.nextInt();

		System.out.println(sum(input));

	}

}

import java.util.Scanner;

public class Decimal_to_Binary {

	static void binary(int n)
	{
		if(n==0)
			return;
		binary(n/2);
		System.out.print(n%2+" ");
		
	}
	public static void main(String[] args) {
	
		Scanner x = new Scanner(System.in);
		System.out.println("Enter any number");
		int input = x.nextInt();

		binary(input);

	}

}

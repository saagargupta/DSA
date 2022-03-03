/**
 * @author SAGAR
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Alternative_sorting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello world");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int i = 0, j = n - 1;             //setting i to lower limit and j to upper limit
		Arrays.sort(array);            //sorting the given array
		while (i < j) {
			System.out.print(array[j--] + " ");         //printing the maximum elements one by one
			
			System.out.print(array[i++] + " ");           //printing the minimum elements one by one
		}
		if (n % 2 != 0) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();

	}

}

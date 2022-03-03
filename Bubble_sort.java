/**
 * @author SAGAR
 *
 */

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i - 1; j++) {
				if (array[j + 1] > array[j]) // Descending order
				{
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();

	}

}

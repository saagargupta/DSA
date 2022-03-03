/**
 * @author SAGAR
 *
 */

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = x.nextInt();

		System.out.println("Enter the Array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = x.nextInt();
		}
		selection_Sort(array, size);
		
		x.close();

	}

	public static void selection_Sort(int a[], int n) {
		int min_index = 0;

		for (int i = 0; i < n - 1; i++) {
			min_index = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}
			int temp = a[min_index];
			a[min_index] = a[i];
			a[i] = temp;
		}
		printArray(a, n);
	}

	public static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

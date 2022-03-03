/**
 * @author SAGAR
 *
 */
import java.util.Scanner;

public class K_Sorted_Array {

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

		//System.out.println("Enter the Size of K-Sorted Array");
		//int size = sc.nextInt();
		k_Sorted_Array(array, n);
		
		sc.close();
		
	}

	static void k_Sorted_Array(int A[], int size) {
		int i, key, j;
		for (i = 1; i < size; i++) {
			key = A[i];
			j = i - 1;

			/*
			 * Move elements of A[0..i-1], that are greater than key, to one position ahead
			 * of their current position. This loop will run at most k times
			 */
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = key;
		}
		printArray(A);
	}

	static void printArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

}

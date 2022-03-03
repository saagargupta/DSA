/**
 * @author SAGAR
 *
 */

import java.util.Scanner;

public class Insertion_sort {

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
		insertionSort(array, size);
		
		x.close();
	}

	public static void insertionSort(int Array[], int n) {
		int key = 0, j = 0;
		for (int i = 1; i < n; i++) {
			key = Array[i];
			j = i - 1;

			while (j >= 0 && Array[j] > key) {
				Array[j + 1] = Array[j];
				j = j - 1;
			}
			Array[j + 1] = key;
		}
		printArray(Array, n);
	}

	public static void printArray(int a[],int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}

}


public class Quick_Sort {
	static void quicksort(int a[], int low, int high) {
		//System.out.println(low+" "+high);
		if (low < high) {
			int pivot = partition(a, low, high);
			quicksort(a, low, pivot - 1);
			quicksort(a, pivot + 1, high);

		}
	}

	static int partition(int a[], int low, int high) {
		int pivot = a[low];
		int i = low;
		int j = high;
		while (i<j) {
            while (a[i] <= pivot && i<=high)
                i++;
            while (a[j] > pivot && j>=low)
                j--;
            if (i<j)
                swap(a,i,j);
        }
		return j;
	}

	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length - 1;

		quicksort(arr, 0, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}

}

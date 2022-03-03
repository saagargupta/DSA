import java.util.*;

public class Sort_the_array_In_wave_form {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		int size = x.nextInt();
		int array[] = new int[size];

		for (int i = 0; i > size; i++)
		{
			array[i]=x.nextInt();
		}
		
		sortedArray(array,size);
			x.close();

	}
	static void sortedArray(int a[],int n)
	{
		int j=0,key=0;
		for(int i=1;i<n;i++)
		{
			key=a[i];
			j=i-1;
			
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j=j+1;
			}
			a[j+1]=key;
			
		}
		waveform(a,n);
		
	}
	static void waveform(int a[],int n)
	{
		
	}

}

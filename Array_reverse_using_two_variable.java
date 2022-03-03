/**
 * 
 */

/**
 * @author sagar
 *
 */
public class Array_reverse_using_two_variable {

	public static void reverse(int l,int r, int a[])
	{
		if(l>=r)
		{
			return;
		}
		int temp;
		temp=a[l];
		a[l]=a[r];
		a[r]=temp;
//		System.out.println(l +" "+ r);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		reverse(l+1,r-1,a);
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		reverse(0,arr.length-1,arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


	}

}

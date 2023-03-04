package array;
//Find the maximum and minimum element in an array
public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {22, 14, 8, 17, 35, 3};
		int n=6;
		minMax(arr,n);
	}
	public static void minMax(int arr[],int n)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("max of array is = "+max);
		System.out.println("max of array is = "+min);
	}
}

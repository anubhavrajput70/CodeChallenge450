package array;
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class ArraySort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0, 2, 1, 2, 0};
		int n=5;
		sort012(arr,n);

	}
	static void sort012(int arr[],int n)
	{
		int low=0,mid=0,high=n-1;
		for(int i=0;i<=high;i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[i];
				arr[i]=arr[high];
				arr[high]=temp;
				high--;
			}
			else
				mid++;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

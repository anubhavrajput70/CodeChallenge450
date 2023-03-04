package array;
//Move all the negative elements to one side of the array 
public class AllNegativeAside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int n=9;
		moveNegative(arr,n);
	}
	public static void moveNegative(int arr[],int n)
	{
		int low=0,high=n-1;
		for(int i=0;i<=high;i++)
		{
			if(arr[i]<=0)
			{
				swap(arr,i,low);
				low++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}

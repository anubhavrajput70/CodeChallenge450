package array;
//Write a program to cyclically rotate an array by one.
public class RightRotateByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		int n=5;
		rotate(arr,n);
	}
	public static void rotate(int arr[],int n)
	{
		int temp=arr[n-1];
		for(int i=n-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=temp;
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}

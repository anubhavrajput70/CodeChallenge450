package array;
//find Largest sum contiguous Subarray 
public class LargestSumContigousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,-2,5};
		int n=5;
		System.out.println(largestSum(arr,n));
	}
	public static int largestSum(int arr[],int n)
	{
		int maxSum=Integer.MIN_VALUE,currSum=0;
		for(int i=0;i<n;i++)
		{
			currSum=currSum+arr[i];
			maxSum=Math.max(maxSum, currSum);
			if(currSum<0)
				currSum=0;
		}
		return maxSum;
	}
}

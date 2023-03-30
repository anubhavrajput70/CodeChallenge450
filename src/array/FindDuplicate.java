package array;
//find duplicate in an array of N+1 Integers
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,2};
		int n=5;
		int temp=duplicate_slowfast(arr,n);
		if(temp==0)
			System.out.println("no repeated element found");
		else
			System.out.println("repeated element is = "+temp);
	}
	//brute force approach time= O(n^2) space = O(1)
	public static int duplicate_brute(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					return arr[j];
			}
		}
		return 0;
	}
	//ount the frequency of the num in the array. time= O(n) space = O(n)
	public static int duplicate_count(int arr[],int n)
	{
		int[] cnt=new int[n+1];
		for(int i=0;i<n;i++)
		{
			cnt[arr[i]]++;
			if(cnt[arr[i]]>1)
				return arr[i];
		}
		return 0;
	}
	
	//hash set approach time= O(n) space = O(n)
	public static int duplicate_set(int arr[],int n)
	{
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(!set.add(arr[i]))
			{
				return arr[i];
			}
		}
		return 0;
	}
	//slow and fast pointer approach time= O(n) space = O(1)
		public static int duplicate_slowfast(int arr[],int n)
		{
			int slow=0,fast=0;
			do {
				slow=arr[slow];
				fast=arr[arr[fast]];
			} while(slow!=fast);
			slow=0;
			while(slow!=fast)
			{
				slow=arr[slow];
				fast=arr[fast];
			}
			return slow;
		}

}

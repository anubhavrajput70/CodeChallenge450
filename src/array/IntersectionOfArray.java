package array;
//intersection of two arrays
import java.util.HashSet;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {85, 25, 1, 32, 54, 6};
		int arr1[]= {85, 2,3};
		System.out.println(intersection(arr,arr1));
	}
	public static int intersection(int arr[],int arr1[])
	{
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(hs.contains(arr1[i]))
			{
				hs.remove(arr1[i]);
			}
			else
				hs.add(arr1[i]);
		}
		return hs.size();
	}
}

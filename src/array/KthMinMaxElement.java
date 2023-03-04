package array;

import java.util.Collections;
import java.util.PriorityQueue;

//Find the "Kth" max and min element of an array 
public class KthMinMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7, 10, 4, 3, 20, 15};
		int k=3;
		System.out.println(k+" largest element is ="+kthLargest(arr,k));
		System.out.println(k+" smallest element is ="+kthSmallest(arr,k));
	}
	public static int kthLargest(int arr[],int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]>pq.peek())
			{
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}
	public static int kthSmallest(int arr[],int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]<pq.peek())
			{
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}

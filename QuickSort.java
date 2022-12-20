package exception_handling;
import java.util.*;
public class QuickSort 
{
	static int partition(int arr[],int lb,int ub)
	{
		int temp;
		int pivot=lb,start=lb,end=ub;
		while(start<end)
		{
			while(arr[start]<arr[pivot])
				start++;
			while(arr[end]>arr[pivot])
				end--;
			if(start<end)
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		temp=arr[start];
		arr[start]=arr[pivot];
		arr[pivot]=temp;
		return(end);
	}
	static void sort(int arr[],int lb,int ub)
	{
		if(lb<ub)
		{
			int end=partition(arr,lb,ub);
			sort(arr,lb,end-1);
			sort(arr,end+1,ub);
		}
	}
	public static void main(String[] args) 
	{	
		Scanner in=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		System.out.println("Array before sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
		sort(arr,0,n-1);
		System.out.println("Array after sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}

}

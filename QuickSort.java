import java.util.*;
public class QuickSort 
{
	static int partition(String arr[],int lb,int ub)
	{
		String temp;
		int pivot=lb,start=lb,end=ub;
		while(start<end)
		{
			while(arr[start].compareTo(arr[pivot])<0)
				start++;
			while(arr[end].compareTo(arr[pivot])>0)
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
	static void sort(String arr[],int lb,int ub)
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
		System.out.print("Enter the number of names: ");
		int n=in.nextInt();
		String names[] = new String[n];
		System.out.println("Enter "+n+" names.");
		for(int i=0;i<n;i++)
			names[i] = in.next();
		sort(names,0,n-1);
		System.out.println("Sorted names: ");
		for(int i=0;i<n;i++)
			System.out.println(names[i]);
		System.out.println();
	}
}

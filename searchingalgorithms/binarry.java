package searchingalgorithms;

import java.util.Scanner;

public class binarry 
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	System.err.println("enter the array size");
	int n= sc.nextInt();
	int[] arr=new int[n];
	System.err.println("enter the values");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.err.println("enter the searching element");
	int search=sc.nextInt();
	binarry ob=new binarry();
	ob.bsearch(arr, n, search);
	sc.close();
}
public void bsearch(int arr[],int n,int search)
{
	int left=0,right=n-1,mid;
	while(left<=right)
	{
		mid=(left+right)/2;
		if(search==arr[mid])
		{
			System.err.println("the element founded in "+(mid+1));
			break;
			
		}
		else if(arr[mid]<search)
		{
			left=mid+1;
		}
		else if(arr[mid]>search)
		{
			right=mid-1;
		}
//		if(mid!=search)
//			System.err.println(search+" element not founded in the list");
	}
}
}
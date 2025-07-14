package searchingalgorithms;
import java.util.Scanner;
public class binarrysearch
{
	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.err.println("enter the searching element");
		int search=sc.nextInt();
		bsearch(arr,n,search);
		sc.close();
	}
	public static void bsearch(int arr[],int n,int search)
	{
		int f=0,l=n-1,mid;
//		mid=(f+l)/2;
		while(l<f)
		{
			mid=(f+l)/2;
			if(arr[mid]==search)
			{
				System.out.println(arr[mid]+"search elemrnt is founded "+mid);
				break;
			}
			else if(arr[mid]<search)
			{
				f=mid+1;
			}
			else if(arr[mid]>search)
			{
			l=mid-1;
			}
			else;
			{
				System.out.println(arr[mid] +"is not founded");
			}
		}
	}

}

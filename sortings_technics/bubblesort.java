package sortings_technics;
import java.util.Scanner;
public class bubblesort
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.err.println("enter the arraysize of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.err.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bsort(arr,n);
		System.out.println("AFTER USING BUBBLE SORTING ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
     }
	public static void bsort(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
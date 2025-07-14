package sortings_technics;

import java.util.Scanner;

public class insertionsort 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no.of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Insort(arr,n);
	}
	public static void Insort(int arr[],int n)
	{
		
	}
}

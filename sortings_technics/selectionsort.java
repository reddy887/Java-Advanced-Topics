package sortings_technics;
import java.util.Scanner;
public class selectionsort 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.err.println("enter the size of selection");
		int n=sc.nextInt();
		System.out.println("enter the values");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Ssort(n,arr);
		System.out.println(arr[i]);
	}
	public static void Ssort(int n,int arr[]) 
	{
		int min,loc,i,j;
		for(i=0;i<n;i++)
		{
			min=arr[i];
			loc=i;
			for(j=i+1;j<n;j++)
			{
				if(min>=loc)
				{
					min=arr[j];
					loc=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
		}
	}
}

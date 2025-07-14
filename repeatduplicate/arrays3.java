package repeatduplicate;

public class arrays3
{
	public static void commonelement(int arr1[],int arr2[],int arr3[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr3.length;k++)
				{
					if(arr1[i]==arr2[j]&&arr2[j]==arr3[k])
					{
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
	public static void main(String args[])
	{
		int arr1[]= {23,45,67,78,79,99};
		int arr2[]= {2,22,33,45,47,99};
		int arr3[]= {23,45,67,78,89,100,79};
		commonelement(arr1,arr2,arr3);
	}
}

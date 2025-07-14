package repeatduplicate;

public class segregate0s 
{
	public static void main(String[] args)
	{
		int x=0;
		int arr[]=new int[] {0,1,0,1,0,0,1};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[x++]=arr[i];
			}
		}
		while(x<arr.length)
		{
			arr[x++]=1;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}

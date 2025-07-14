package repeatduplicate;

import java.util.Arrays;

public class deletedelment 
{
	public static void main(String[] args) 
	{
		
		int[] arr=new int[] {2,3,4,5,6,7,8};
		int[] newarr=new int[arr.length-1];
		int delet =2;
		for(int i=0,j=0;i<arr.length;i++)
		{
//			System.out.println(arr[i]);
			if(i!= delet)
			{
				newarr[j++]=arr[i];
			}
			System.out.println(newarr[j-1]);
		}
		System.err.println(Arrays.toString(newarr));
	}
}

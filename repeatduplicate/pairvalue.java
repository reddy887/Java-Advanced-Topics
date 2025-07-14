package repeatduplicate;

public class pairvalue {
	public static void main(String[] args) {
		//sorted array compulsory
		int[] arr= {1,2,4,5,6,7,8,9};
		int merge=5;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				 int add=arr[i]+arr[j];
				 boolean same=arr[j]==merge;
				 
				if (add==merge)
				{
					System.out.println(arr[i]+"+"+arr[j]+"="+add);
					break;
				}
			}
		}
	}

}

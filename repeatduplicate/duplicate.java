package repeatduplicate;

import java.util.HashSet;
import java.util.Set;

public class duplicate {
	public static void main(String[] args) {
		int[] arr= {4,5,6};
		Set<Integer>unic=new HashSet<>();
		boolean isdupli=false;
		for(int i=0;i<arr.length;i++)
		{
			if(unic.contains(arr[i]))
			{
				isdupli=true;
				System.out.println("dup"+arr[i]);
			}
			else
			{
				unic.add(arr[i]);
			}
		}
		if (!isdupli)
		{
			System.out.println(-1);
		}
	}
}

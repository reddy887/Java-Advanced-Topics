package searchingalgorithms;
import java.util.Scanner;
public class linearsearch {
	static int i;
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
			int search;
			System.out.println("enter the search element");
			search=sc.nextInt();
			for(int i=0;i<n;i++)
				System.err.println((arr[i]==search)?"search element founded"+(i+1) +"location":((i==n))?"not founded":" ");
			sc.close();

		}
}

package frameworkspractice;
import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

public class vectorprac 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of vectort");
		int n=sc.nextInt();
		Vector<Integer>v1 =new Vector<>();
		System.out.println("enter the values :");
		for(int i=0;i<n;i++)
		{
			v1.add(sc.nextInt());
		}
		
		System.out.println("before the sorting "+v1);
		Collections.sort(v1);
		System.out.println("After sorting "+v1);
		sc.close();
	}

}

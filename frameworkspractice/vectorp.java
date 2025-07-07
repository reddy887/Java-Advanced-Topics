package frameworkspractice;
import java.util.Collections;
import java.util.Scanner;

import java.util.Vector;

public class vectorp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vector size");
		int n=sc.nextInt();
		Vector<Integer> v2=new Vector<>();
		System.out.println("enter the values:");
		v2.add(0,99);
		for(int i=0;i<n;i++)
		{
			 v2.add(sc.nextInt());
		}
		System.out.println("before the sorting "+v2);
		Collections.sort(v2);
		System.err.println("After the sorting"+v2);
		System.out.println("enter the search element:");
		int search=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(v2.get(i)==search)
			{
				System.out.println("the search element is"+search + " index"+i );
				break;
			}
		}
		System.out.println("enter the remove element");
		int remove=v2.remove(sc.nextInt());
		System.out.println(remove+"is removed sucessfully");
		v2.clear();
		System.out.println(v2);
		sc.close();
	}

}

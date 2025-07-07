package frameworkspractice;

import java.util.*;

public class Iterato {

	public static void main(String[] args) 
	{
		/*
		 * this itrator was can use ladecy class 1.0 and new class 1.2
		 * 
		 */
//		ArrayList<String> it=new ArrayList<>();
//		Iterator<Integer>i=it.iterator();
 ArrayList <Integer>a =new ArrayList<>();
		a.add(6);
		a.add(56);
		a.add(46);
Iterator<Integer>i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

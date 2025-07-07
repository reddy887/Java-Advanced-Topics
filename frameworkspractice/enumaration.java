package frameworkspractice;
import java.util.*;
public class enumaration 
{

	public static void main(String args[])
	{
/*		enum is a interface introduded for iteration the lagacy collection objects
 * lagacy class are when introduced the java 1.0 version class they are lagacy class in collections
 * lagacey class hashtable,stack,vector,dictonaryand propertyes
 */
	Vector<Integer> v=new Vector<>();	
	Enumeration<Integer> e=v.elements();
    v.add(45);
	v.add(56);
	v.add(90);
	//two methods 
	//1.v.hasmorElement
	//2.v.next
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	}
}

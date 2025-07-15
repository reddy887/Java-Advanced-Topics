package comparableandcompataror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class usingcompara
{
	public static void main(String[] args) 
	{
		
		Integer[] arr= {2,1,5,4,3};
		Arrays.sort(arr);
		System.err.println(Arrays.toString(arr));
		
//		List<Integer>li=new ArrayList<>(Arrays.asList(arr));
//		Collections.sort(li);
//		System.err.println(li);
		compa[] stud= {
				new compa (2,"reddy",300),
				new compa (1,"babu",345),
				new compa (4,"hari",500),
				new compa (3,"ha",555)
		}; 
		System.out.println(Arrays.toString(stud));
		Arrays.sort(stud);
		List<compa>re=new ArrayList<>(Arrays.asList(stud));
		Collections.sort(re);
    //    System.err.println(re);
	}
}
class compa
{
	
	int rollno;
	String name;
	int marks;
	public compa(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return rollno+ " " + name+ " " + " " + marks ;
	}
	
}

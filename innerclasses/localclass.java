package innerclasses;

public class localclass 
{
	public static void main(String[] args)
	{	
		int salary=456778;
		class inner
		{
			public void print() {
			System.out.println("the salary is"+salary);
			}
		}
		inner in=new inner();
		in.print();
	}
}
package innerclasses;

public class anonymousclass 
{
	public static void main(String args[])
	{
		class1 cl=new class1()
				{
			public void show()
			{
				System.out.println("this the show method update");
			}
			public void print()
			{
				System.out.println("this the modified print code:");
			}
				};
						
				cl.print();
				cl.show();
	}
}
class class1
{
	public void show()
	{
		System.out.println("this the show method");
	}
	public void print()
	{
		System.out.println("print method");
	}
}

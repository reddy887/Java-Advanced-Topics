package innerclasses;

public class REDDY
{
	public static void main(String[] args)
	{
		car c= (a)-> System.out.println("modified code" +a);
		c.nano(45);
		System.out.println(c.nano2());
	}
}

package recursions;

public class recurs 
{

	public static void main(String[] args)
	{
		
		recurs rt=new recurs();
		System.out.println(rt.re(12));
	}
	public int re(int n)
	{
		if (n<=0)
			return n;
			else 
			return n*re(n-1);
    }
}

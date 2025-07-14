package innerclasses;
@FunctionalInterface
public interface car
{
	public void nano(int a);
	@SuppressWarnings("unused")
	private void nano1()
	{
		int a=45;
		int b=67;
		System.out.println("the nano1 speed"+(a+b));
	}
	default double nano2()
	{
		double c=56.4;
		int d=45;
		return c+d;
	}
	static int nano3()
	{
		return 45;
	}
}

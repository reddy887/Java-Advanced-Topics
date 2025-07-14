package repeatduplicate;

public class insertionsoperations
{
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7};
		int element=1;
		int b[]=new int[a.length+1];
		b[0]=element;
		for(int i=0;i<a.length;i++)
		{
			b[i+1]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}

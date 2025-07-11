package recursions;

public class indirected {
	public static void main(String args[]) {
		indirected red=new indirected();
		red.re(6);
		
	}
	public void re(int n) {
		if (n>0) {
			System.out.println(n);	
			rec(n-1);
		}
		
	}
	public void rec(int n) {
		if(n>0) {
		System.out.println(n);
		re(n-1);
		}
	}

}

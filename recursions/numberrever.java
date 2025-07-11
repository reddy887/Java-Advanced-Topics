package recursions;

public class numberrever {
	public static void main(String args[]) {
		re(10);
		
	}
	public static void re(int r) {
		if (r==0)return;
		System.out.println(r);
		re(r-1);
	}

}

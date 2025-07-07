package genarics;

public class gen {
	public static void main (String args[]) {
		berrybox be=new berrybox(10);
		be.add(new berry("india berry"));
		be.add(new berry("lsvagas berry"));
		be.add(new berry("usa berry"));
		System.out.println(be);
		almandbox al=new almandbox(4);
		al.add(new almand("india almand"));
		al.add(new almand("austrila alamand"));
		System.out.println(al);
		
	}

}
class almand{
	String name;
	public almand(String name) {
		this.name=name;
	}
	public String toString() {
		return null;
	}
	
}
class berry{
	String name;
	public berry(String name) {
		this .name=name;
	}
}
class almandbox{
	almand[] box;
	int index;
	public almandbox(int size) {
		box =new almand[size];
		index=0;
	}
	public void add(almand almand) {
		// TODO Auto-generated method stub
		
	}
	public void get(almand mond) {
		box [index]=mond;
		index++;
	}
	public almand get(int i) {
		return box[i];
	}
}
class berrybox{
	berry[] bo;
	int index;
	public berrybox(int size) {
		bo =new berry[size];
		index=0;
	}
	public void add(berry berr) {
		bo [index]=berr;
		index++;
	}
	public berry get(int i) {
		return bo[i];
	}
}
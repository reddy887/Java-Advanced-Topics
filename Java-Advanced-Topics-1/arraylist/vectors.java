package arraylist;
import java.util.Vector;
public class vectors
{
    public static void main(String args[])
    {
        Vector v2=new Vector();
        Vector <Integer>v=new Vector<>();
        v.add(34);
        v.add(356);
        v2.add(45);
        v2.add(56);
        System.err.println(v2);
        System.err.println(v);
        System.err.println(v2.capacity());
        System.err.println(v.capacity());

    }
}

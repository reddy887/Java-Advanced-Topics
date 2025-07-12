package stringsinjava;
public class code
{
    public static void main(String[] args) 
    {
        String st="reddy babu";//the stored in string pool 
        String st3="reddy babu";
        String st2=new String("reddy babu");//the data stored in heap memory with objects
        String st5=new String("reddy babu");
        System.err.println(st2==st5);
        // know we are comparing the both
        System.err.println(st==st2);//output is the false
        System.err.println(st==st3);
        System.err.println(st.equals(st3));

    }   
}

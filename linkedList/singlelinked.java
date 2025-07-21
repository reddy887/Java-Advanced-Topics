package linkedList;
import java.util.LinkedList;
class Node
{
    int data ;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class singlelinked
{
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(34);
        li.add(356);
        System.err.println(li.size());
        System.out.println(li);
    }
}

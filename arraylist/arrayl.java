package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

class arrayl
{
    public static void main (String args[])
    {
        Integer[] ar=new Integer[]{2,3,4,6,8};
        ArrayList <Integer>arr= new java.util.ArrayList<Integer>(Arrays.asList(ar));
        arr.add(23);
        System.out.println(arr.contains(23));
        //using for each loop
        for(Integer i:arr)
        {
            System.out.println(i);
        }
        //using for loop
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i));
        }
    }
}
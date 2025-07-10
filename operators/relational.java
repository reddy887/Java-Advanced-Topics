package operators;
import java.util.Scanner;
public class relational {
    public int check( int num)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();

        if (n==num)
        {
            System.out.println("the numbers are equale");
        }
        else if (n!=num)
        {
            System.out.println("the numbers are not equal");
            if (n<num||n>num)
            {
                System.out.println("the number is "+n +" "+num);

            }
        }
       return num;
    }
    public static void main (String[] args)
    {
        relational re= new relational();
        re.check(100);
    }
}

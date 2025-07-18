package files;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class filehandle 
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("./files theory.txt");
        if(!f1.exists()){
            f1.createNewFile();
        }
        Scanner sc=new Scanner(f1);
        String text=" ";
        while (sc.hasNext())
        {
            text=sc.nextLine();
        }
        System.out.println(text);
    }
}

package files;
import java.io.File;
public class filehandle 
{
    public static void main(String[] args) 
    {
        File f1=new File("./files theory.txt");
        System.out.println(f1.canRead());
    }
}

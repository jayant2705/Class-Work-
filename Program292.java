
import java.util.*;

class Program292
{
    public static void main(String A[])
    {
         Vector <String> vobj = new Vector <String>();

         vobj.add("C");
         vobj.add("C++");
         vobj.add("Java");
         vobj.add("Python");
         vobj.add("C#");
         vobj.add("Java");

         System.out.println(vobj);

         vobj.add("LSP");

         System.out.println(vobj);

         System.out.println(vobj.capacity());

         System.out.println(vobj.contains("LSP"));
         System.out.println(vobj.contains("UNIX"));
    }
}
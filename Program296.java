
import java.util.*;

class Program296
{
    public static void main(String A[])
    {
          Hashtable< String, Integer> hobj = new Hashtable <String , Integer>();

          hobj.put("PPA",27000);
          hobj.put("LSP",29000);
          hobj.put("Python",30000);
          hobj.put("LB",31000);

          System.out.println(hobj);
          
          System.out.println(hobj.get("LB"));
          
    }
}
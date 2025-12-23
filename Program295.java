
import java.util.*;

class Program295
{
    public static void main(String A[])
    {
         LinkedList <Double> vobj = new LinkedList <Double>();

         vobj.add(10.5);
         vobj.add(30.7);
         vobj.add(70.6);
         vobj.add(19.7);
         vobj.add(80.5);

         System.out.println(vobj);

         vobj.addFirst(10.0);
         vobj.addFirst(20.0);

         vobj.remove(2);

         System.out.println(vobj);

         Iterator iobj = vobj.Iterator();

         while(iobj.hashNext())
         {
            System.out.println(iobj.next());
         }
         vobj.clear();

    }
}
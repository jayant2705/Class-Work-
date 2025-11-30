import java.util.*;

class StringX
{
    public void Display(String str)
    {
        int icnt = 0;
        for(icnt = 0; icnt < str.length();icnt++)
        {
            System.out.println(str.charAt(icnt));
        }
    }
}
class Program242
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();
         
        StringX strobj = new StringX();

        strobj.Display(sobj);
    }
}

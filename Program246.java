import java.util.*;

class StringX
{
    public void Display(String str)
    {
        
        int icnt = 0;

        char Arr[] = str.toCharArray();

        for(icnt = 0; icnt < str.length();icnt++)
        {
            System.out.println(Arr[icnt]);
        }
    }
}
class Program246
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

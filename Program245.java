import java.util.*;

class Program245
{
    public static void main(String A[])
    {
        int icnt = 0;

        
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();

        char Arr[] = sobj.toCharArray();
         
        for(icnt = 0; icnt < Arr.length;icnt++)
        {
        System.out.println(Arr[icnt]);
        }
    }
}

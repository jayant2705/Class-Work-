import java.util.*;

class Program241
{
    public static void main(String A[])
    {
        int icnt = 0;
    
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String str = sobj.nextLine();

        for(icnt = 0; icnt < str.length(); icnt++)
        {
            System.out.println(str.charAt(icnt));
        }
         
         
    }
}

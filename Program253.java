import java.util.*;

class StringX
{
    public String ToLowerCaseX(String str)
    {
        int icnt = 0;

        char Arr[] = str.toCharArray();

        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            if(Arr[icnt] >= 'A' && Arr[icnt] <= 'Z')
            {
                Arr[icnt] = (char) (Arr[icnt] + 32);
            }
        }

        return new String(Arr);             
    }
}
class Program253
{
    public static void main(String A[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();
         
        StringX strobj = new StringX();

        sRet = strobj.ToLowerCaseX(sobj);             

        System.out.println(" Updated String :"+sRet);
    }
}

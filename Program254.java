import java.util.*;

class StringX
{
    public String strToggleX(String str)
    {
        int icnt = 0;

        char Arr[] = str.toCharArray();

        for(icnt = 0; icnt < Arr.length; icnt++)
        {
            if(Arr[icnt] >= 'A' && Arr[icnt] <= 'Z')
            {
                Arr[icnt] = (char) (Arr[icnt] + 32);
            }
            else if(Arr[icnt] >= 'a' && Arr[icnt] <= 'z')
            {
                Arr[icnt] = (char) (Arr[icnt] - 32);
            }
        }

        return new String(Arr);             
    }
}
class Program254
{
    public static void main(String A[])
    {
        String sRet = null;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();
         
        StringX strobj = new StringX();

        sRet = strobj.strToggleX(sobj);             

        System.out.println(" Updated String :"+sRet);
    }
}

import java.util.*;

class StringX
{
    public int CapitalCount(String str)
    {
        int icnt = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(icnt = 0; icnt < str.length();icnt++)
        {
            if(Arr[icnt] == 'A' && Arr[icnt] == 'Z')
            {
                iCount++;
            }
        }
          return iCount;
    }
}
class Program249
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();
         
        StringX strobj = new StringX();

        iRet = strobj.CapitalCount(sobj);

        System.out.println(" Frequency of Capital characters :"+iRet);
    }
}

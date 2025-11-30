import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int icnt = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(icnt = 0; icnt < str.length();icnt++)
        {
            if(Arr[icnt] == 'a' && Arr[icnt] == 'z')
            {
                iCount++;
            }
        }
          return iCount;
    }
}
class Program248
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();
         
        StringX strobj = new StringX();

        iRet = strobj.CountSmall(sobj);

        System.out.println(" Frequency of small characters :"+iRet);
    }
}

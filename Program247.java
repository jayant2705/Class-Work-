import java.util.*;

class StringX
{
    public int CountOccurance(String str)
    {
        int icnt = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(icnt = 0; icnt < str.length();icnt++)
        {
            if(Arr[icnt] == 'a')
            {
                iCount++;
            }
        }
          return iCount;
    }
}
class Program247
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanobj = new Scanner(System.in);
        
        System.out.println("Enter String:");
        String sobj = scanobj.nextLine();
         
        StringX strobj = new StringX();

        iRet = strobj.CountOccurance(sobj);

        System.out.println("Occurance is :"+iRet);
    }
}

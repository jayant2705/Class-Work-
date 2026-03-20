 import java.util.*;

class Program819
{
    public static boolean CheckStrong(int iNo)
    {
        int iTemp = 0, iSum = 0, iDigit = 0;

        iTemp = iNo;
          
        int FactArr [] = {1,1,2,6,24,120,720,5040,40320,362880};

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + FactArr[iDigit];

            iNo = iNo / 10;
        }
         
        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        boolean bRet = false;

        bRet = CheckStrong(iNo);

        if(bRet == true)
        {
            System.out.println(iNo + "is a Strong Number");
        }
        else
        {
            System.out.println(iNo + "is Not a Strong Number");
        }
      
        sobj.close();

        
    }
}

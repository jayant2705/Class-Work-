 import java.util.*;

class Program836
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iDigit = 0, iCount = 0, iSum =0, iTemp = 0;

        System.out.println("Enter The number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + ((int)Math.pow(iDigit, iCount));
            iCount--;
            iNo = iNo / 10;
        }
         
        if(iSum == iTemp)
        {
            System.out.println( iTemp + " is disarium Number");
        }
        else
        {
             System.out.println( iTemp + " is Not disarium Number");
        }
    }
}

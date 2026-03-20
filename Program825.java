 import java.util.*;

class Program825
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPow = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        int iCount = 0, iDigit = 0, iTemp = 0, iSum = 0;

        iTemp = iNo;

        // Count Number of Digits
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;


        // Y = icount
        // X = iDigit
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iPow = 1;

                // Count Power
               /*  while(iCount != 0)
                {
                    iPow = iPow * iDigit;
                    iCount--;
                }*/

                    iPow = (int)Math.pow(iDigit,iCount);


            iSum = iSum + iPow;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println(iTemp + " is a Armstrong Number");
        }
        else
        {
            System.out.println(iTemp + " is Not a Armstrong Number");
        }  
    }
}

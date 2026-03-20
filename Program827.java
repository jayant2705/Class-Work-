 import java.util.*;

class Program827
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPow = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        int iCount = 0, iDigit = 0, iTemp = 0, iSum = 0;

        iCount = Integer.toString(iNo).length();

        while(iNo != 0)
        {
            iPow = 1;

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

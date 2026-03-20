 import java.util.*;

class Program837
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iTemp = 0, iDigit = 0, iSum = 0, iCube = 0, iDeno = 0, iCount = 0;

        System.out.println("Enter The number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        iCube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iDeno = (int)Math.pow(10,iCount);

        if(iCube % iDeno == iTemp)
        {
            System.out.println(iTemp + " It is Trimorphric Number");
        }
        else
        {
            System.out.println(iTemp + " It is Not Trimorphric Number");
        }
    }
}

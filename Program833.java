 import java.util.*;

class Program833
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iSum = 0, iMult = 0, iDigit = 0, iTemp = 0;

        System.out.println("Enter The number : ");
        iNo = sobj.nextInt();

        iMult = 1;

        iTemp = iNo;
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;
            iMult = iMult * iDigit;

            iNo = iNo / 10;
        }

        if(iSum == 0)
        {
            System.out.println(iTemp + " Spy number");
        }
        else
        {
            System.out.println(iTemp + " Not Spy number");
        }
    }
}

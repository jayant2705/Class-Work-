 import java.util.*;

class Program831
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iTemp = 0, iDigit = 0, iSum = 0;

        System.out.println("Enter The number : ");
        iNo = sobj.nextInt();

        iTemp = iNo;

        iNo = iNo * iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        if(iSum == iTemp)
        {
            System.out.println(iTemp + " It is Neon Number");
        }
        else
        {
            System.out.println(iTemp + " It is Not Neon Number");
        }
    }
}

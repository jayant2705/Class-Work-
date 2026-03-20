 import java.util.*;

class Program829
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter The number : ");
        iNo = sobj.nextInt();

        int iDigit = 0, iTemp = 0, iRev = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }

        System.out.println(iRev);
    }
}

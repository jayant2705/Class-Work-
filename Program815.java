import java.util.*;

class Program815
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0 , iFact = 1 , i = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        // 6
        // 9 * 5 *4 * 3 * 2 * 1

        iFact = 1;
        for(i = iNo; i >= 1; i--)
        {
            iFact = iFact * i;
        }

        System.out.println("Factorial is : "+iFact);
    }
}

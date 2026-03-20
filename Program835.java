 import java.util.*;

class Program835
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter The number : ");
        iNo = sobj.nextInt();

        iNo++;

        double ans = (int)Math.sqrt(iNo);

        if(iNo == (ans * ans))
        {
            System.out.println((iNo -1) + "Is Sunny Number");
        }
        else
        {
            System.out.println((iNo -1) + "Is Not Sunny Number");
        }

         
    }
}

 import java.util.*;

class Program821
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int X = 0, Y = 0, iPow = 0;

        System.out.println("Enter Base : ");
        X = sobj.nextInt();

        System.out.println("Enter Power : ");
        Y = sobj.nextInt();

        iPow = 1;
        while(Y != 0)
        {
            iPow = iPow * X;
            Y--;
        }

        System.out.println(iPow);
         
    }
}

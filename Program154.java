// Input : 6
// Output : # * # * # *
//          1 2 3 4 5
import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int icnt = 0;
        for(icnt = 1; icnt <= iNo; icnt++)
        {
            {
                if((icnt % 2) == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("#\t");
                }
            }
            System.out.print("\t");
        }
    } 
}

class Program154
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Frequency: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}
// Input : 6
// Output : -6 -5 -4 -2 - 0 2 3 4 5

import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int icnt = 0;
        for(icnt = -iNo; icnt <= -0; icnt++)

            {
                    System.out.print(icnt+"\t");    
            }
        for(icnt = 1; icnt<= iNo; icnt++)
         {
            System.out.print(icnt+"\t");
         }
            System.out.println();
    } 
}

class Program159
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
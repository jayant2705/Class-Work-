// Input : 5
// Output : -5      -4      -3      -2      -1      0       1       2       3       4       5

import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int icnt = 0;
        for(icnt = -iNo; icnt <= iNo; icnt++)

            {
                    System.out.print(icnt+"\t");    
            }
        
            System.out.println();
    } 
}

class Program160
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
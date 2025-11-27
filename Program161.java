// Input : 6
// Output :  1       *       2       *       3       *    

import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int icnt = 0;
        int iCount = 0;

        iCount = 1;
        for(icnt = 1; icnt <= iNo; icnt++)
            {
                if(icnt % 2 == 0)
                {
                    System.out.print("*\t"); 
                }
                else
                {
                    System.out.print(icnt+"\t"); 
                    iCount++;
                }
            }
        
            System.out.println();
    } 
}

class Program161
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
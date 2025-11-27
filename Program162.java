// Input : 6
// Output : 1       *       2       *       3       *   

import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int icnt = 0;
         
        for(icnt = 1; icnt <= iNo; icnt++)
            {
                if(icnt % 2 == 0)
                {
                    System.out.print("*\t"); 
                }
                else
                {
                    System.out.print(((icnt / 2) + 1)+"\t"); 
                }
            }
        
            System.out.println();
    } 
}

class Program162
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
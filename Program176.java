/*
    Input : 8
    Output  :  1    A   3   B   5   C   7   D
    Index   :  1    2   3   4   5    6   7   8
     
*/
import java.util.*;
class Pattern
{
    public void Display(int iNo)
    { 
        int icnt = 0;
        char ch = 'A';   
         
        for(icnt = 1; icnt <= iNo; icnt++)
            {
                if(icnt % 2 == 0)
                {
                    System.out.printf("%c\t",ch);
                    ch++;
                }
                else
                {
                    System.out.printf("%d\t",icnt);
                }

                
            }
            System.out.println();
    } 
}

class Program176
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
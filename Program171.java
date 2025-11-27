/*
    Input : 5
    Output  : a    b   c   d   e
    Index   : 1    2   3   4   5
    ASCII   : 97    98  99  100 101 102
     
*/
import java.util.*;
class Pattern
{
    public void Display(int iNo)
    { 
        int icnt= 0;
        int i = 97;
         
        for(icnt = 1; icnt <= iNo; icnt++)
            {
                 
                System.out.printf("%d\t",i+icnt);
                i++;
            }

            System.out.println();
    } 
}

class Program171
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
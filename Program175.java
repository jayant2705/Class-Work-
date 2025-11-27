/*
    Input : 5
    Output  : A    B   C   D    E
    Index   : 1    2   3   4   5
    ASCII   : 65    66  67  68  69
     
*/
import java.util.*;
class Pattern
{
    public void Display(int iNo)
    { 
        int icnt = 0;
        char ch = 'A';    // int i = 97;
         
        for(icnt = 1; icnt <= iNo; icnt++,ch++)
            {
                 
                System.out.printf("%c\t",ch);
                
            }
            System.out.println();
    } 
}

class Program175
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
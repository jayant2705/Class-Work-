/*
    Input : 8
    Output  :   z       y       x       w       v       u       t       s
    Index   :   0       1       2       3       4       3      2       1
     
*/
import java.util.*;
class Pattern
{
    public void Display(int iNo)
    { 
        int icnt = 0;
        char ch = 'z';   
         
        for(icnt = 1; icnt <= iNo; icnt++,ch--)
            {
                    System.out.printf("%c\t",ch);
            }
            System.out.println();
    } 
}

class Program177
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
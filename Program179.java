/*
    iRow : 4
    iCol  : 4
    
    a   b   c   d
    a   b   c   d
    a   b   c   d
    a   b   c   d
     
*/
import java.util.*;
class Pattern
{
    public void Display(int iRow ,int iCol)
    { 
        int i= 0;
        int j= 0;
        char ch = 'a';
         
        for(i = 1; i <= iRow; i++)
        {
            ch ='a';
            for(j = 1; j <= iCol; j++,ch++)
                {
                    System.out.printf("%c\t",ch);
                }
                  System.out.println();
        }
    } 
}

class Program179
{
    public static void main(String A[])
    {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Row: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the  number of Row: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}
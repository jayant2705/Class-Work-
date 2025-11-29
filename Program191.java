/*
    iRow : 4
    iCol  :4
    
    #   #   #   #
    *   #   #   #
    *   *   #   #
    *   *   *   #
    
     
*/
import java.util.*;
class Pattern
{
    // Filter for square Matrix
    public void Display(int iRow ,int iCol)
    { 
        int i= 0;
        int j= 0;
         
        for(i = 1; i <= iRow; i++)
        {
            
            for(j = 1 ; j <= iCol; j++)
                if(i  > j)
                {
                    System.out.printf("%%\t"); // Exception
                }
                else if(i > j)
                {
                    System.out.printf("*\t");
                }
                else
                {
                    System.out.printf("#\t");
                }
                  System.out.println();
        }
    } 
}

class Program190
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
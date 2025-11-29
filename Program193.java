/*
    iRow : 4
    iCol  :4
    
     *
     *  *
     *  *   *
     *  *   *   *
    
     
*/
import java.util.*;
class Pattern
{
    // Filter for square Matrix
    public void Display(int iRow ,int iCol)
    { 
        int i= 0;
        int j= 0;
        
        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
             System.out.println("Row and Column should be same........");
        }
        for(i = 1; i <= iRow; i++)
        {
            
            for(j = 1 ; j <= iCol; j++)
                if(i >=j)
                {
                    System.out.print("*\t"); 
                }
                 
                  System.out.println();
        }
    } 
}

class Program193
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
import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int i = 0;
        int isum = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }
                                      // Change
        for(i = 1; (i<= (iNo / 2)) && (isum < iNo); i++)
        {
            if(iNo % i == 0)
            {
                isum = isum + i;
            }
            
        }

        return(isum == iNo); 
    }
}      //End of Number Class

class Program83
{
    public static void main(String A[]) 
    {
        int iValue = 0;
        boolean bRet = false;
         
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckPerfect(iValue);

            if(bRet == true)
            {
                System.out.println(iValue+"is Perfect number");
            }
            else
            {
                System.out.println(iValue+"is Not Perfect number");
            }

        //Important

        sobj = null;
        nobj = null;    

        System.gc();
    }
}
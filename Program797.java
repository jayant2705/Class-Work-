
import java.util.Scanner;

class Program797
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter Your Current Balance : ");
        int Current_Balance = sobj.nextInt();

        System.out.println("Please Enter The Amount that you want to Withdraw : ");
        int WithDraw_Amount = sobj.nextInt();

        if(Current_Balance < 0 || WithDraw_Amount <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(WithDraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed : Withdrawl Amount must be a multiple of 100");
        }
        else if(WithDraw_Amount > 25000)
        {
            System.out.println("Transaction Failed : Maximum Withdrawal per transaction is 25000");
        }
        else if(Current_Balance - WithDraw_Amount < 1000)
        {
            System.out.println("Transaction Failed : After Withdrawal balance must remain at least 1000");
        }
        else
        {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : "+(Current_Balance - WithDraw_Amount));
        }
    } 
}
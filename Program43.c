// Input : 12 2     ouput : true
// Input : 12 3     ouput : true
// Input : 12 5     ouput : true
// Input : 12 12    ouput : true
// Input : 12 7     ouput : true
#include<stdio.h>

int main()
{
    int iValue1 = 0, iValue2 =0;

    printf("Enter first number \n");
    scanf("%d",&iValue1);

     printf("Enter Second number \n");
     scanf("%d",&iValue2);

     if((iValue1 % iValue2)==0)
     {
        printf("It is Completely Divisible\n");
     }
     else
     {
        printf("It is not Divisible\n");
     }

     return 0;
  
}
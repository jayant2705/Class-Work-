/*
    START
        Accept Number and store as no 
        divide no by 2
        if the remainder is 0 
            then display as Even
        otherwise
            display as odd
    STOP
*/
#include<stdio.h>
void CheckEvenOdd(int iNo )
{
    int iRem = 0;
    iRem = iNo % 2;

    if(iRem == 0)
    {
        printf("It is even number : \n");
    }
    else
    {
        printf("It is Odd number : \n");

    }

}

int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    CheckEvenOdd(iValue);

    return 0;
}
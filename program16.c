////////////////////////////////////////////////////////////////////
//
// Required Header Files
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>                   //For Input Output
#include<stdbool.h>                 //For bool datatype


////////////////////////////////////////////////////////////////////
//
//  Function Name  :    CheckEvenOdd
//  Description    :    It is used to check even or odd.
//  input          :    int
//  output         :    bool
//  Author Name    :    Jayant Deepak Purkar
//
////////////////////////////////////////////////////////////////////




 bool CheckEvenOdd(int iNo )
{
    int iRem = 0;
    iRem = iNo % 2;

    if(iRem == 0)
    {
        return true;
    }
    else
    {
        return false;

    }

}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    bRet = CheckEvenOdd(iValue);

    if(bRet == true)
    {     printf("%d is even number \n",iValue); }
    else
        { printf("%d is odd number \n",iValue); }
    return 0;
}
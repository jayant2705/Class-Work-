/*
 Step 1 : understand proble statement 
 Step 2 : write the algorithm 
 step 3 : Decide the programming language
 step 4 : write the program
step 5: test the program
*/
/*
   Algorthm

   START 
      accept first number as no1
      accept second number as no2
      If the input is negative then convert it into positive
      perform Addition of no1 & no2
      display the addition on screen
   STOP
*/
/////////////////////////////////////////////////////////
//
// Required Header Files
//
/////////////////////////////////////////////////////////

#include<stdio.h>

/////////////////////////////////////////////////////////
//
//  Function Name:  AdditionTwoNumbers
//  Description:    It is used to perform addition
//  Input:          Float, Float        
//  output:         Float
//  Author:         Jayant Deepak Purkar
//  Date:           09/10/2025
//
/////////////////////////////////////////////////////////


float AdditionTwoNumbers(float fNo1 , float fNo2)
{
    float fSum=0;

//updator
    if(fNo1 < 0.0f)
    {
        fNo1 = -fNo1;
    }
    if(fNo2 < 0.0f)
    {
        fNo2 = -fNo2;
    }

    fSum = fNo1+fNo2;   //Business Logic
    return fSum;
}

/////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
/////////////////////////////////////////////////////////

int main()
{
 
    float fValue1=0.0f, fValue2=0.0f, fRet= 0.0f;

    printf("Enter your First number :  \n");
    scanf("%f",&fValue1);

    printf("Enter your Second number : \n");
    scanf("%f",&fValue2);

    fRet =  AdditionTwoNumbers(fValue1,fValue2);
    
    printf("Addition is :%f\n",fRet);

    return 0;
}

/////////////////////////////////////////////////////////
//
//  Testcases successfully handle by the application
//
//  Input : 10.5    Input : 3.2   output : 13.7 
//  Input : -10.5   Input : 3.2   output : 13.7
//  Input : 10.5    Input : -3.2  output : 13.7
//  Input : 10.5    Input : 3.2   output : 13.7
//  Input : 10.5    Input : 3.2   output : 10.5
//
/////////////////////////////////////////////////////////
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


float AdditionTwoNumbers(                                                                                                                   
                            float fNo1,  //first input  
                            float fNo2   //second input
                        )
{
    float fSum=0;                        //To store the result

 
    if(fNo1 < 0.0f)                      //updator
    {
        fNo1 = -fNo1;
    }
    if(fNo2 < 0.0f)                      //updator
    {
        fNo2 = -fNo2;
    }

    fSum = fNo1+fNo2;                   //Business Logic
    return fSum;
}   //end of Addition

/////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
/////////////////////////////////////////////////////////

int main()
{
 
    float fValue1=0.0f, fValue2=0.0f;          //To accept user input
    float fRet= 0.0f;                         //To store the result

    printf("Enter your First number :  \n");
    scanf("%f",&fValue1);

    printf("Enter your Second number : \n");
    scanf("%f",&fValue2);

    fRet =  AdditionTwoNumbers(fValue1,fValue2);            //method
    
    printf("Addition is :%f\n",fRet);

    return 0;
}   //End of main

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
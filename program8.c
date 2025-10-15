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
      perform Addition of no1 & no2
      display the addition on screen
   STOP
*/
#include<stdio.h>
float AdditionTwoNumbers(float fNo1 , float fNo2)
{
    float fSum=0;
    fSum = fNo1+fNo2;   //Business Logic
    return fSum;
}
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
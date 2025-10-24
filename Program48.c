//Factors of 6
#include<stdio.h>
void DisplayFactors(int iNo)
{
    int icnt =0;
    for(icnt = 1;icnt<=iNo;icnt++)
    {

    if(iNo < 0)
    {
        printf("%d",icnt);
    }

 }
     
}
int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    DisplayFactors(iValue);

     return 0;
  
}
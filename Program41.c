 
#include<stdio.h>

void Display(int iNo)
    {
        int icnt = 0;           //short hand operator
        for(icnt=2; icnt<=iNo; icnt+=2)
        {
            printf("%d\t",icnt);
        }
        printf("\n");
    }

    //Time Complexity : O(N/2)
int main()
{
    int iValue = 0;
    printf("Please Enter a Frequency :\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0; 
}
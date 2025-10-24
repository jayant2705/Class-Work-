 
#include<stdio.h>

void Display(int iNo)
    {
        int icnt = 0;            
        for(icnt=1; icnt<=iNo; icnt++)
        {
            if((icnt % 2 )== 0)
            printf("%d\t",icnt);
        }
        printf("\n");
    }

    //Time Complexity : O(N)
int main()
{
    int iValue = 0;
    printf("Please Enter a Frequency :\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0; 
}
 
#include<stdio.h>

void Display(int iNo)
    {
        int icnt = 0;
        for(icnt=iNo;icnt>=0;icnt--)
        {
            printf("%d\t",icnt);
        }
        printf("\n");
    }
int main()
{
    int iValue = 0;
    printf("Please Enter a number :\n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0; 
}
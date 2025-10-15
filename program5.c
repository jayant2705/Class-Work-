#include<stdio.h>
int main()
{
 
    int i=0, j=0, ans = 0;

    printf("Enter your First number :  \n");
    scanf("%d",&i);

    printf("Enter your Second number : \n");
    scanf("%d",&j);

    ans = i+j; //Business Logic
    
    printf("Addition is :%d\n",ans);

    return 0;
}
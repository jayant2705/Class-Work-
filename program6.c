#include<stdio.h>
int Add(int a,int b)
{
    int sum=0;
    sum = a+b; //Business Logic
    return sum;
}
int main()
{
 
    int i=0, j=0, ans = 0;

    printf("Enter your First number :  \n");
    scanf("%d",&i);

    printf("Enter your Second number : \n");
    scanf("%d",&j);

    ans = Add(i,j);
    
    printf("Addition is :%d\n",ans);

    return 0;
}
#include<stdio.h>
#include<stdlib.h>
void Display(int Arr[], int iSize)
{
     int icnt = 0;
     for(icnt = 0; icnt < iSize; icnt++)
    {
        printf("%d\n",Arr[icnt]);
        
         
    }
}
int main()
{
    int iLength = 0, icnt = 0;
    int *ptr = NULL;

    printf("Enter number of Elements : \n");
    scanf("%d",&iLength);  //5

    ptr = (int *)malloc(iLength * sizeof(int));
    printf("Enter the Elements :\n");
    for(icnt = 0; icnt < iLength; icnt++)
    {
        scanf("%d",&ptr[icnt]);
    }
    Display(ptr,iLength);

    free(ptr);

    return 0;
}
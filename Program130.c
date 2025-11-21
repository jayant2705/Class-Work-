#include<stdio.h>
#include<stdlib.h>
float Average(int Arr[], int iSize)
{
     int icnt = 0, iSum = 0;

     for(icnt = 0; icnt < iSize; icnt++)
    {
          iSum = iSum + Arr[icnt];
    }
    return (iSum / iSize);    // issue
}
int main()
{
    int iLength = 0, icnt = 0;
    float fRet = 0;
    int *ptr = NULL;

    printf("Enter number of Elements : \n");
    scanf("%d",&iLength);  //5

    ptr = (int *)malloc(iLength * sizeof(int));
    if(NULL == ptr)  // Industrial way of coding
    {
        printf("Enable to allocate memory\n");
        return -1;
    }
    printf("Enter the Elements :\n");
    for(icnt = 0; icnt < iLength; icnt++)
    {
        scanf("%d",&ptr[icnt]);
    }
    fRet =  Average(ptr,iLength);
    printf("Average is  : %f\n",fRet);
 

    return 0;
}
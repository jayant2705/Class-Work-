#include<stdio.h>
#include<stdlib.h>
int Summation(int Arr[], int iSize)
{
     int icnt = 0, iSum = 0;

     for(icnt = 0; icnt < iSize; icnt++)
    {
         iSum = iSum + Arr[icnt];
          
    }
    return iSum;   
}
int main()
{
    int iLength = 0, icnt = 0, iRet = 0;
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
    iRet = Summation(ptr,iLength);
    printf("Addition is  : %d\n",iRet);
 

    return 0;
}
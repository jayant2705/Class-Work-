#include<stdio.h>
#include<stdlib.h>

typedef int * IPTR;

int FrequencyCalculate(int Arr[],int iSize)
{
 int icnt  = 0, icount = 0;
 for(icnt = 0; icnt < iSize; icnt++)
 {
    if(Arr[icnt] == 11)
    {
        icount++;
    }
 }
 return icount;
}

int main()
{                                            
    int iLength = 0, icnt = 0, iRet = 0;
    IPTR iptr = NULL;

    printf("Enter the  number of Elements : \n");
    scanf("%d",&iLength);   

    // Step 1 : Allocate the memory
    iptr = (IPTR)malloc(iLength * sizeof(int));

    if(NULL == iptr)    
    {
        printf("Enable to allocate the memory\n");
        return -1;
    }
    printf("Enter the Value :\n");
    for(icnt = 0; icnt < iLength; icnt++)
    {
        scanf("%d",&iptr[icnt]);
    }
    // Step 2 : Use the Memory
    iRet = FrequencyCalculate(iptr, iLength);
    printf("Frequency of 11 is : %d\n",iRet);

    // Step 3 : free the memory
    free(iptr);
     
    return 0;
}
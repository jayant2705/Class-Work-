#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef int * IPTR;

// Order of N
bool  LinearSearch(int Arr[],int iSize, int iNo)
{
 int icnt  = 0, icount = 0;
 for(icnt = 0; icnt < iSize; icnt++)
 {
    if(Arr[icnt] == iNo)
    {
        icount++;
        break;
    }
 }
    if(icount > 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{                                            
    int iLength = 0, icnt = 0,iValue = 0;
    bool bRet = false;
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

    printf("Enter the number to Search \n");
    scanf("%d",&iValue);
    // Step 2 : Use the Memory
    bRet =  LinearSearch(iptr, iLength, iValue);
     
    if(bRet == true)
    {
        printf("%d is present in the data \n",iValue);
    }
    else
    {
         printf("%d is not present in the data \n",iValue);
    }

    // Step 3 : free the memory
    free(iptr);
     
    return 0;
}
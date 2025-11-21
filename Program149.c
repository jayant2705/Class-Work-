 #include<stdio.h>
#include<stdlib.h>
 

typedef int * IPTR;

void ReverseDispaly(int Arr[], int iSize)
{
    int icnt = 0;

    for(icnt = iSize-1; icnt >= 0; icnt--)
    {
         printf("%d\n",Arr[icnt]);
    }
}
int main()
{                                            
    int iLength = 0, icnt = 0;
    int iRet = 0;
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
     
     ReverseDispaly(iptr,iLength);

    printf( "Updated data Array is :\n");
    for(icnt = 0; icnt < iLength; icnt++)
    {
        printf("%d\n",iptr[icnt]);
    }

    // Step 3 : free the memory


    free(iptr);
     
    return 0;
}
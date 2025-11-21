#include<stdio.h>
#include<stdlib.h>
int main()
{                                            
    int iLength = 0, icnt = 0;
    int *iptr = NULL;

    printf("Enter the  number of Elements : \n");
    scanf("%d",&iLength);   

    // Step 1 : Allocate the memory
    iptr = (int *)malloc(iLength * sizeof(int));

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
    // Call to the function which contains business logic
    // Fun(iptr, ilength)

    // Step 3 : free the memory
    free(iptr);
     
    return 0;
}
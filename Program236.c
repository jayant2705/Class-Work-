
// Problems Of String

#include<stdio.h>

void strupX(char str[])
{
    while(*str !='\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            *str = *str - 32;
        }
         
        str++;
    }      
}
int main()
{
     char Arr[50] = {'\0'};
      

     printf("Enter String :\n");
     scanf("%[^'\n']s",Arr);

      strupX(Arr);
     printf("Updated String is : %s",Arr);
     return 0;
}
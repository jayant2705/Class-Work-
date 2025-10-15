  #include<stdio.h>
 // Dynamic function

  void Display(int iFrequence)
{
    int icnt = 0;

    if(iFrequence < 0)
    {
        printf("Invalid input\n");
        return;
    }

    for(icnt=0;icnt<iFrequence;icnt++)
    {
      printf ("Jay Ganesh...\n");
    }

}

 int main()
{ 
    int iCount = 0;
    printf("enter the Frequency\n") ;
    scanf("%d",&iCount);

    Display(iCount);  

    return 0;
}

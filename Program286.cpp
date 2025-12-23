#include<iostream>
using namespace std;

void Display()
{
    static int icnt = 1;

    while(icnt <= 4)
    {
        cout<<"Jay Ganesh....\n";
        icnt++;
        Display();
        
    }
}
      
int main()
{
    Display();
    return 0;
}
#include<iostream>
using namespace std;

void Display()
{

    static int icnt = 0;      // Static Storage Class
    cout<<"Jay Ganesh...."<<icnt<<"\n";
    icnt++;
    Display();
}
      
int main()
{
    Display();
    return 0;
}
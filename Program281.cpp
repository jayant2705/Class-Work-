#include<iostream>
using namespace std;

void Display()
{

    int icnt = 0;      // Auto Storage Class
    cout<<"Jay Ganesh...."<<icnt<<"\n";
    icnt++;
    Display();
}
      
int main()
{
    Display();
    return 0;
}
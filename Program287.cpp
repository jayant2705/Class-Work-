#include<iostream>
using namespace std;

void Display()
{
    static int icnt = 1;
    auto i = 1;

    if(icnt <= 3)
    {
        cout<<"Jay Ganesh...."<<icnt<<" "<<i<<"\n";
        icnt++;
        i++;
        Display();   
    }
}
      
int main()
{
    cout<<"Inside Main\n";
    Display();
    cout<<"End of Main\n";
    return 0;
}
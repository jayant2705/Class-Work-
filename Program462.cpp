#include<iostream>
using namespace std;

template<class T>
T Addition(T No1, T No2)
{
    T Ans;
    Ans = No1+ No2;
    return Ans;
}

int main()
{
    cout<<"Addition of Chracters : "<<Addition('a', 'b')<<"\n";

     cout<<"Addition of Integers : "<<Addition(11, 10)<<"\n";

    cout<<"Addition of Floats : "<<Addition(90.3f , 78.5f)<<"\n";

    cout<<"Addition of Doubles : "<<Addition(78.6866, 78.5254)<<"\n";

    return 0;
}
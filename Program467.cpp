#include<iostream>
using namespace std;

template<class T>
class Arithematic
{
    public:
        T No1;
        T No2;

        Arithematic(T A, T B)
        {
            No1 = A;
            No2 = B;

        }
        int Addition()
        {
            T Ans;
            Ans = No1 + No2;
            return Ans;
        }

        int Substraction()
        {
            T Ans;
            Ans = No1 - No2;
            return Ans;
        }
};

int main()
{
    Arithematic <int> iobj(11,10);

    cout<<"Addition Is : "<<iobj.Addition()<<"\n";
    cout<<"Substraction Is : "<<iobj.Substraction()<<"\n";

    Arithematic <double> dobj(11.4567,10.4537);

    cout<<"Addition Is : "<<dobj.Addition()<<"\n";
    cout<<"Substraction Is : "<<dobj.Substraction()<<"\n";
    
    return 0;
}
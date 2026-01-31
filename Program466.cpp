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
    Arithematic <int> obj(11,10);

    cout<<"Addition Is : "<<obj.Addition()<<"\n";

     cout<<"Substraction Is : "<<obj.Substraction()<<"\n";
    
    return 0;
}
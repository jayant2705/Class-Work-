#include<iostream>
using namespace std;

template<class T>

T Addition(T No1, T No2)
{
    T Ans;
    Ans = No1 + No2;
    return Ans;
}
int main()
{
    int iValue1 =10, iValue2 = 21, iRet = 0;
    float fValue1 =10.5f, fValue2 = 20.2f, fRet = 0.0f;
    double dValue1 =10.4, dValue2 = 21.7, dRet = 0.0;

    iRet = Addition(iValue1,iValue2);
    cout<<"Addition of int  :"<<iRet<<"\n";

    fRet = Addition(fValue1,fValue2);
    cout<<"Addition of float  :"<<fRet<<"\n";

    dRet = Addition(dValue1,dValue2);
    cout<<"Addition of double  :"<<dRet<<"\n";
    return 0;
}
#include<iostream>
using namespace std;

float Summation(float Arr[], float iSize)
{
    int icnt = 0.0;
    float fSum = 0.0;

    for(icnt = 0; icnt < iSize; icnt++)
    {
        fSum = fSum + Arr[icnt];
    }
    return fSum;
}

int main()
{
    float Brr[] ={10.1f,20.2f,30.3f,40.4f,50.5f};
    float fRet = 0.0;

    fRet = Summation(Brr,5);

    cout<<"Summation is :"<<fRet<<"\n";

    return 0;
}
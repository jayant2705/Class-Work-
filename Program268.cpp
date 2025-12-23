 #include<iostream>
using namespace std;

template<class T>
T Summation(T Arr[], int iSize)
{
    int  icnt = 0;
    T iSum = 0;

    for(icnt = 0; icnt < iSize; icnt++)
    {
        iSum = iSum + Arr[icnt];
    }
    return iSum;
}

int main()
{
    float Brr[] ={10.1f,20.2f,30.3f,40.4f,50.5f};
    float iRet = 0;

    iRet = Summation(Brr,5);

    cout<<"Summation is :"<<iRet<<"\n";

    return 0;
}
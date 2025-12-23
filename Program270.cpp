 #include<iostream>
using namespace std;

template<class T>
T Maximum(T Arr[], int iSize)
{
    int  icnt = 0;
    T iMax;

    iMax = Arr[0];

    for(icnt = 0; icnt < iSize; icnt++)
    {
         if(iMax < Arr[icnt])
         {
            iMax = Arr[icnt];
         }
    }
    return iMax;
}

int main()
{
    float Brr[] ={10.1f,20.2f,30.3f,40.4f,50.5f};
    float iRet = 0;

    iRet = Maximum(Brr,5);

    cout<<"Maximum is :"<<iRet<<"\n";

    return 0;
}
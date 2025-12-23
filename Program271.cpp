 #include<iostream>
using namespace std;

template<class T>
int CountFrequency(T Arr[], int iSize, T No)
{
    int  icnt = 0;
    int iCount = 0;

    for(icnt = 0; icnt < iSize; icnt++)
    {
         if(Arr[icnt] == No )
         {
             iCount++;
         }
    }
    return iCount++;
}

int main()
{
    float Brr[] ={10.1f,20.2f,30.3f,40.4f,50.5f,20.2f};
    int  iRet = 0;

    iRet = CountFrequency(Brr,6,20.2f);

    cout<<"Frequency is :"<<iRet<<"\n";

    return 0;
}
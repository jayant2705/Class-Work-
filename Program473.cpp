#include<iostream>
using namespace std;

class ArrayX
{
    public :
        int *Arr; 
        int iSize;

        ArrayX(int No)
        {
            cout<<"Inside Constructor\n";
            iSize = No;
            Arr = new int[iSize];
        }

        ~ArrayX()
        {
            cout<<"Inside Destructor\n";
            delete [] Arr;
        }
        void Accept()
        {
            int icnt = 0;
            cout<<"Enter The Elements : \n";

            for(icnt = 0; icnt < iSize; icnt++)
            {
                cin>>Arr[icnt];
            }
        }

         void Display()
        {
            
             int icnt = 0;
             cout<<"Elements of the Array are : \n";

             for(icnt = 0; icnt < iSize; icnt++)
            {
                cout<<Arr[icnt]<<"\t";
            }
            cout<<"\n";
        }

};


int main()
{
    int iValue = 0;

    cout<<"Enter the number of elements : \n";
    cin>>iValue;

    // Step 1 : Allocate the Memory
    ArrayX *aobj = new ArrayX(iValue);

     // Step 2 : Use the Memory
     //LB
     aobj -> Accept();
     aobj -> Display();

    //Step 3 : Deallocate the Memory
    delete aobj;

    return 0;
}
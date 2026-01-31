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

};


int main()
{
    // Step 1 : Allocate the Memory
    ArrayX *aobj = new ArrayX(10);

     // Step 2 : Use the Memory
     //LB

    //Step 3 : Deallocate the Memory
    delete aobj;

    return 0;
}
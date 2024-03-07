#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
        int privar;
    protected:
        int provar;
    public:
        int pubvar;
    void setVar(int priValue,int proValue,int pubValue){
        privar = priValue;
        provar = proValue;
        pubvar = pubValue;   
    }
    void getvar()
    {
         cout<<"The private value is :"<<privar<<endl;
         cout<<"The protected value is :"<<provar<<endl;
         cout<<"The public value is : "<<pubvar<<endl;
    }
};
int main()
{
    AccessSpecifierDemo a;
    int x,y,z;
    cout<<"Enter the values of privar provar pubvar : "<<endl;
    cin>>x>>y>>z;
    a.setVar(x,y,z);
    a.getvar();
}
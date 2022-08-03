#include<bits/stdc++.h>
using namespace std;
int main()
{
    int size;
    cin >>size;
    int ara[size];
    for(int i = 0 ; i < size ; i++)
    {
        cin >> ara[i];
    }
    int key;
    
    cin >> key;
    
    for(int i = 0 ; i < size ; i++ )
    {
        if(key == ara[i])
        {
            cout<<i<<endl;
            break;
        }
        
    }
    
}
#include<bits/stdc++.h>
using namespace std;

const int N  = 1e+7;                                          // declared the array global cause i don't like to pass the array

int ara[N]; 


// for binary search it is important that array or vector should be sorted


void binary_search(int low , int high , int n)
{
    
    int mid = (low+high)/2;
    
    if(ara[mid] == n)
    {
        cout <<"index : " << mid <<" = "<< ara[mid]<<endl; 
        return ;
    }
    
    if(ara[mid] < n)
    {
        low = mid ; 
        binary_search(low , high , n);
        
    }
    
    if(ara[mid] > n)
    {
        high = mid;
        binary_search(low , high , n);
    }
    
    
}

int main()
{
    int n ;
    
    cin >> n ;
    
    for(int i = 0 ; i < n ; i++)
    {
        cin >> ara[i];
    }
    
    // for binary search it is important that array or vector should be sorted
    
    sort(ara , ara+n);                  // it will kinda sort your array it needs the first and the last address as the argument // O(nlogn)
    
    cout <<"after sorting of the array"<<endl; 
    for(int i = 0 ; i < n ; i++)
    {
        cout << ara[i] <<" ";
    }
    cout <<"\n";
    int num;
    puts("enter the number you want to search");
    cin >> num;
    
    binary_search(0 , n-1, num);
    return 0 ;
}
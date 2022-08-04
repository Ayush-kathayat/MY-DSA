


// for Practice :: (https://leetcode.com/problems/binary-search/)



class Solution {
    public int search(int[] ara, int key) 
    {
        int start = 0;
        int end   = ara.length - 1;
        int mid;
        if(ara.length == 1)
        {
            if(ara[0] == key)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        while(start <= end)
        {
            mid = start + (end - start) / 2;
            
            if(ara[mid] == key)
            {
                return mid;
            }
            if(ara[mid] < key)
            {
                start = (mid + 1);
            }
            if(ara[mid] > key)
            {
                end = (mid -1);
            }
            
        }
        
        return -1;
        
    }
}
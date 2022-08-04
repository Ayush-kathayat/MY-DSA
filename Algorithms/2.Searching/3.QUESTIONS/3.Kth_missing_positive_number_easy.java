//For practice :: (https://leetcode.com/problems/kth-missing-positive-number/)

class Solution {
    public int findKthPositive(int[] ara, int k) 
    {
        int cnt = 0;
        int j  = 1;
            for(int i = 0   ; i < ara.length ;  j++   )
            {
                if(ara[i] != j)
                {
                    cnt++;
                    
                }
                else
                {
                    i++;
                }
                if(cnt == k)
                {
                    return j;
                }
                
                if(i == (ara.length) )
                {
                    return ( j + (k - cnt));
                }
                
            }
        return 0;
         
    }
}
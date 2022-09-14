// link to the question --> https://leetcode.com/problems/richest-customer-wealth/submissions/

class Solution {
    public int maximumWealth(int[][] ara) 
    {
        int maxi = Integer.MIN_VALUE;
        
        int Max_sum ;
        for(int i = 0 ; i < ara.length ; i++)
        {
            
            Max_sum = 0 ;
            
            for(int j = 0 ; j < ara[i].length ; j++)
            {
                Max_sum = Max_sum + ara[i][j];
            }
            
            maxi = Math.max(maxi , Max_sum);
        }
        
        return maxi;
    }
}
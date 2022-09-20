// link to the question --> https://leetcode.com/problems/shuffle-the-array/submissions/
class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        
        int[] ara;
        
        ara = new int[2*n];
        int k = 0;
        
        for(int i = 0 ; i < (2*n) ; i++)
        {
           
            ara[i] = nums[i-k];
            k++;
            i++;
            ara[i] = nums[n+i-k];
            
        }
        
        return ara;
    }
}
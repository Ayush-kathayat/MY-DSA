// link to the question -->https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        
        int cnt = 0;
        
        int[] ans;
        
        ans = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            cnt = 0;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(nums[i] > nums[j] && j != i)
                {
                    cnt++;
                }
            }
            
            ans[i] = cnt;
        }
        
        return ans;
        
    }
}
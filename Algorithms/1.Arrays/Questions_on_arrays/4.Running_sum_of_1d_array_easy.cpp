// link to the question --> https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
public:
    vector<int> runningSum(vector<int>& nums)
    {
        vector<int> prefix_sum;
        
        
        int sum = 0;
        for(int i = 0 ; i < nums.size(); i++)
        {
            sum = sum + nums[i]; 
            
            prefix_sum.push_back(sum);
            
        }
        
        return prefix_sum;
    }
};
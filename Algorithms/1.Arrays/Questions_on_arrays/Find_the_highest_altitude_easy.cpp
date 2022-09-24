
// link to the question :: https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
public:
    int largestAltitude(vector<int>& gain) 
    {
        // take the prefix sum
        
        std::vector <int> prefix_sum;
        int sum  = 0;
        for(int i = 1 ; i <= gain.size(); i++)
        {
            sum = sum + gain[i-1];
            gain[i-1] = sum;
        }
        
        gain.push_back(0);   // pushing 0 for obvious reasons
        
        int maxi = INT_MIN;
        
        for(auto i : gain)
        {
            maxi = max(i,maxi);
        }
        
        return maxi;
    }
};

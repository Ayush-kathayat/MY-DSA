
// link to the question --> https://leetcode.com/problems/concatenation-of-array/

class Solution {
public:
    vector<int> getConcatenation(vector<int>& ara)
    {
        int original_size = 2*(ara.size());
        
        vector <int> ans;
        
        ans.reserve(original_size);
        
        int i ;
        int ans_1;
        
        for( i = 0 ; i < ara.size() ; i++)
        {
            ans_1 = ara[i];
            
            ans.push_back(ans_1);
        }
        
        for( i = 0 ; i < ara.size() ; i++)
        {
            ans_1 = ara[i];
            
            ans.push_back(ans_1);
        }
        
        return ans;
        
        
        
    }
};
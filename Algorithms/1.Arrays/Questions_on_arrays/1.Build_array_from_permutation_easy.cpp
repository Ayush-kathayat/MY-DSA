
// link to the question --> https://leetcode.com/problems/build-array-from-permutation/

class Solution {
public:
    vector<int> buildArray(vector<int>& ara)  // here the type is vector<int>
    {
        vector <int> ans;
        
        ans.reserve(ara.size());            // The C++ function std::vector::reserve(n) requests to reserve vector capacity be at least enough to contain n elements. Reallocation happens if there is need of more space.
        
        int ans_1;
        for(int i = 0 ; i < ara.size() ; i++)
        {
            ans_1 = ara[ara[i]];
            ans.push_back(ans_1);
        }
        
        return ans;
    }
};
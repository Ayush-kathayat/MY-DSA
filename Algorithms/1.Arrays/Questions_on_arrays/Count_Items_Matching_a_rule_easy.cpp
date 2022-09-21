// link to the question --> https://leetcode.com/problems/count-items-matching-a-rule/

class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) 
    {
        int i;
        
            if(ruleKey == "type")
            i = 0;
            
            if(ruleKey == "color")
            i = 1;
            
            if(ruleKey == "name")
            i = 2;
        
        int size = items.size();
        
        cout << "row size : "<<size<<endl;
        cout << "col size : "<<items[0].size()<<endl;
        int cnt = 0;
        cout << "i : "<<i <<endl;
        for(int j = 0 ; j < size ; j++)
        {
            if(items[j][i] == ruleValue)
            {
                cnt++;
                cout <<items[j][i]<<endl;
            }
        }
        
        return cnt;
        
    }
};

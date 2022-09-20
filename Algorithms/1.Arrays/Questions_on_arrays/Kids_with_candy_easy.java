
// link to the question -->https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        
        List<Boolean> list = new ArrayList<Boolean>();    // allocation 
        
        boolean condition = false;
        int sum;
        
        for(int i = 0 ; i < candies.length ; i++)
        {
            sum = candies[i] + extraCandies;
            
            for(int j = 0 ; j < candies.length ; j++)
            {
                if(sum < candies[j] )
                {
                    condition = false;
                    break;
                }
                
                
                if(sum >= candies[j])
                {
                    condition = true;
                }
            }
            
            if(condition)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        
        return list;
    }
}
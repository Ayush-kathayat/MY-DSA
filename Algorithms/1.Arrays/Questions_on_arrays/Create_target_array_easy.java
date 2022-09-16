//link to the question ->https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int[] target ;
        
        target = new int[nums.length];
        
        
        ArrayList <Integer> list = new ArrayList<Integer>();
        
        
        for(int i = 0 ; i < nums.length ; i++)      // i didn't know that add function do this too
        {
            list.add(index[i], nums[i]);
        }
        
        int k = 0;
        for(int i : list)   // a for each loop 
        {
            target[k] = list.get(k++);
        }
        
        
        return target;
        
    
    }
}
//link to the question -> https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/



class Solution {
    public boolean checkIfPangram(String sentence) 
    {
      
	    int[] hash;
        int key;
        hash = new int[122+1];
        int cnt = 0;
        
        
        for(int i = 0 ; i < sentence.length(); i++)          // a = 97 , z = 122 == ascII decimal
        {
            key = sentence.charAt(i);
         
            // System.out.println(sentence.charAt(i));         // here use sentence.charAt(i) for using it
        
            if(hash[key]++ == 0)
            {
                cnt++;
            }
        }
        
        // System.out.print("cnt: " + cnt);
        
        
        if(cnt < 26)
        {
            return false;
        }
        else
        {
            return true;
        }
        
        
    }
}

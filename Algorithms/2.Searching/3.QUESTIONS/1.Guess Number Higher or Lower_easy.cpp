/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


// FOR PRACTICE THE LINK IS BELOW:
(https://leetcode.com/problems/guess-number-higher-or-lower/)
class Solution {
public:
    int guessNumber(int n) 
    {
        long long int low = 0 ;
        long long int high = n ;
        
        long long  int mid;

        
        
        while(low <= high)
        {
            mid = (low + high)/2;
            
            
            
            if(guess(mid) == 0)       // equal
            {
                return mid;
            }
            
            if(guess(mid) == 1)        // target is greater
            {
                low = (mid + 1);
            }
            
            if(guess(mid) == -1)       // target is smaller
            {
                high = (mid - 1);
            }
        }
        
        return 0;
    }
};
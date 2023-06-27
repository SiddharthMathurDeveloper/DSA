
/* 
  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
*/ 

class Solution {
    public int[] getConcatenation(int[] nums) {
      
         int numsLength = nums.length; // get the length of nums

        int [] concatedNums = new int[numsLength*2]; // store the result double of n [0,0,0,0,0,0]

        for (int i = 0; i < numsLength; i++) { // loop till n 
               
         concatedNums[i] = nums[i]; // get first value store ith index [1,0,0,0,0,0]  [1,2,1]
               
         concatedNums[i+numsLength] = nums[i]; // get first value store in n+1 index [1,0,0,1,0,0]  [1,2,1]] i=0 n=3 i+n = 3 
          
        }

        return  concatedNums;
      
    }
}

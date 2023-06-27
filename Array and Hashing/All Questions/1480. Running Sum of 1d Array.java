
/* 

  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
*/ 


class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum=0;
        
        int index=0;
        for(int num:nums){
            
            sum+=num;
            
            nums[index] = sum;
            
            index++;
        }

        return nums;
    }
}

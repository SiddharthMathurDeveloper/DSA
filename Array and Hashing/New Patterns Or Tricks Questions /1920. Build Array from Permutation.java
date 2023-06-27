


/* 
  Brute Force -> Time - O(N) Space - O(N) 

*/ 


class Solution {
    public int[] buildArray(int[] nums) {
        int numsLength = nums.length; // take the length of given array

        int[] ans = new int[numsLength]; // ans array yo store the ans

        for(int i=0;i<numsLength;i++){ // loop over the elements
          
            ans[i] = nums[nums[i]]; // use the given formula get the value and put in ans array
          
        } 
        return ans; // return the ans
    }
}
  




xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


/* 
  optimized -> [Time - O(N) Space - O(1)]

  TAG -> [Maths ,Inplace]

  Trick -> How store 2 values within one index using simple maths(divide and mod)

*/  



class Solution {
  
    public int[] buildArray(int[] nums) {
      
        int n = nums.length; // take the length of given array

        for(int i=0;i<n;i++){
          
            nums[i] = nums[i] + (n*(nums[nums[i]]%n)); // storing two values in one place by adding nums[i] to this custom formula (n*(nums[nums[i]]%n)) [this help us store value like[0,8,13] if we want original     value we get by doing mod new value we get by doing / eg -> [0,2,1,5,3,4] orginal after [0,8,13,.,.,] on 13 this 13 store two values (when we divide 13/n->6 = 2 (need value)  , we mod 13%n->6 =1 (orginal value))]
           
        }

        for(int i=0;i<n;i++){
          
            nums[i] = nums[i]/n; // getting the desired value from the storage of 2 values by using divide
          
        }

        return nums; // return nums
    
    }
}




xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx







/* [Brute Force] Time - O(N) Space - O(N) */
  
class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        int[] result = new int[n*2];

        int j=0;
       

        for(int i=0;i<n*2;i+=2){

            result[i] = nums[j];

            result[i+1] = nums[j+n];

            j++;
         
        }
        return result;


    }
}



class Solution {
    public int[] sortArrayByParity(int[] nums) {
      
        int j=0; // make j pointer on start index j points on odd number

      
        for(int i=0;i<nums.length;i++){ // make i pointer on start index and then loop , and move i to search for even number
          
            if(nums[i]%2==0){   // when we find a even number
            
                   swapElements(nums,i,j); // we swap the values of i and j 
              
                    j++; // move j foward then 
            }
        }

        return nums;
    }

    // Function to swap the elements 
    public void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1]; 
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

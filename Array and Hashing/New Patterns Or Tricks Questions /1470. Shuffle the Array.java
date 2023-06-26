

/* 
  Brute Force -> Time - O(N) Space - O(N) 

*/ 
  
class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        int[] result = new int[n*2]; // take a extra space of n*2 to the store elements

        int j=0; // for getting loop over nums
      
        for(int i=0;i<n*2;i+=2){ // till n*2

            result[i] = nums[j]; // store the result of nums[j] to nums[i] x = x1  [2,5,1,3,4,7](nums) result[2] 

            result[i+1] = nums[j+n]; // store the result of nums[j+n] to nums[i+1] y = y1 result[x,3]

            j++; // increase the index
         
        }
        return result; // result the result

    }
}



xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


/* 
  optimized -> [Time - O(N) Space - O(1)]

  TAG -> [Maths ,Inplace]

  Trick -> How store 2 values within one index using simple maths(divide and mod)

*/  



class Solution {
    public int[] shuffle(int[] nums, int n) {
      
        for(int i=0;i<n;i++){ // loop till n
            nums[i+n] += nums[i]*10000; // store the element within the array itself [2,5,1,20003,50004,10007] looks like this


          // We did this because if see this at the n's index u have both values stored by divide we get first value and mod when get that nth index value
        }

        for(int i=0;i<n;i++){ // loop till n
          
            nums[2*i] = nums[i+n]/10000; // even index [get the value first (x) value by divide n'th values and store] ( 20003/10000 -> 2)
          
            nums[2*i+1] = nums[i+n]%10000; // odd index [get the value second (y) value by divide n'th values and store] ( 20003%10000 -> 3)

          // [2,3,1,20003,50004,10007] look like this in nums array furthur the loop we will get all the values
        }

        return nums;
    }
}





xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx






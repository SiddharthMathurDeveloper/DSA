
// brute force
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // brute force
            int num_length = nums.length;
        int[] ans = new int[num_length];

        for (int i = 0; i < num_length; i++) {
            int greaterElement = 0;

            for (int j = 0; j < num_length; j++) {

                if (nums[i] > nums[j]) {
                    greaterElement++;
                }
            }
            ans[i] = greaterElement;

        }


        return ans;
        
        
    }
}






// opimtezed
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int num_length =  nums.length;

        int[] copy =  nums.clone();
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

          Arrays.sort(copy);

        for (int i=0;i<num_length;i++){
            if (!hashMap.containsKey(copy[i])){
                hashMap.put(copy[i],i);
            }
        }

        for (int i=0;i<num_length;i++){
            if (hashMap.containsKey(nums[i])){

                copy[i] = hashMap.get(nums[i]);
            }

        }


        return  copy;
        
    }
}




class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] tempNums = nums;
        int numsLength = nums.length;
        for(int i=0;i<numsLength;i++){
            int num = nums[i];
            nums[i] = num*num;
        }


        Arrays.sort(tempNums);

        return tempNums;
    }
}




class Solution {
    public int[] sortedSquares(int[] nums) {
        int numsLength = nums.length;
        int ans[] = new int[numsLength];
        
        int i=0;
        int j = numsLength -1;

        int index=numsLength-1;
        while(i<=j){
        

            if( Math.abs(nums[i]) >= Math.abs(nums[j]) ){
                ans[index] = nums[i]*nums[i];
                index--;
                i++;
            }
            else{
                ans[index] = nums[j]*nums[j];
                index--;
                j--;
            }


        }

        return ans;

        
    }
}

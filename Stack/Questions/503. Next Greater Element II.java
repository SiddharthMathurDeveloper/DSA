/* Solution 
TC -> O(N)
SC -> O(N)
*/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1); // Initialize the result array with -1

        Stack<Integer> stack = new Stack<>();

        // Iterate through the elements in a circular manner (twice the size of the array)
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Process the elements in the stack and update the result array
            while (!stack.isEmpty() && (nums[i % n] >= stack.peek())) {
                stack.pop(); // Pop elements that are smaller than or equal to the current element
            }

            // If the stack is not empty, update the result for the current index
            if (!stack.isEmpty()) {
                ans[i % n] = stack.peek();
            }

            // Push the current element onto the stack for future comparisons
            stack.push(nums[i % n]);
        }

        return ans;
    }
}

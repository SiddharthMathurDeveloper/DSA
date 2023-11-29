class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // HashMap to store the next greater element for each element in nums2
        HashMap<Integer, Integer> nextGreaterElement = new HashMap<>();
        // Stack to keep track of elements in nums2
        Stack<Integer> stack = new Stack<>();

        // Iterate through elements in nums2
        for (Integer num : nums2) {
            // While the stack is not empty and the current element is greater than the element at the top of the stack
            while (!stack.isEmpty() && stack.peek() < num) {
                // Update the next greater element for the element at the top of the stack
                nextGreaterElement.put(stack.pop(), num);
            }

            // Push the current element onto the stack
            stack.push(num);
        }

        // Array to store the results for nums1
        int[] ans = new int[nums1.length];

        // Iterate through elements in nums1
        for (int i = 0; i < nums1.length; i++) {
            // Get the next greater element from the HashMap, default to -1 if not found
            ans[i] = nextGreaterElement.getOrDefault(nums1[i], -1);
        }

        // Return the array containing the next greater elements for each element in nums1
        return ans;
    }
}

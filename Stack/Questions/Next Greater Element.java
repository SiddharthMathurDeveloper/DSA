/* Solution
TC -> O(N)
SC -> O(N)
*/

class Solution {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {

        Stack<Long> stack = new Stack<>(); // Stack to keep track of elements

        int arrLength = arr.length;
        long[] ans = new long[arrLength]; // Array to store the next greater elements

        // Iterate through the array in reverse order
        for (int i = arrLength - 1; i >= 0; i--) {

            // Pop elements from the stack until an element greater than the current element is found
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }

            // If the stack is empty, there is no greater element, so assign -1
            if (stack.isEmpty()) {
                ans[i] = (long) -1;
            } else {
                ans[i] = stack.peek(); // Assign the next greater element
            }

            stack.push(arr[i]); // Push the current element onto the stack
        }

        return ans;
    }
}

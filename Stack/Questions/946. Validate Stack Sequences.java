/* Solution 1
TC -> O(N)
SC -> O(N)
*/

class Solution {
    // Function to validate stack sequences
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();  // Stack to simulate the push and pop operations
        int poppedIndex = 0;  // Index to track elements in the popped array

        // Iterate through the pushed array
        for (int value : pushed) {
            stack.push(value);  // Push the current element onto the stack

            // Check if the top element of the stack matches the next element to be popped
            while (!stack.isEmpty() && stack.peek() == popped[poppedIndex]) {
                stack.pop();  // If matched, pop the element from the stack
                poppedIndex++;  // Move to the next element in the popped array
            }
        }

        // Check if the stack is empty, indicating a valid sequence
        return stack.isEmpty();
    }
}

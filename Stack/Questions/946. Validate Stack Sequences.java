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


/* Solution 2
TC -> O(N)
SC -> O(1) [Inplace]
*/

class Solution {
    // Function to validate stack sequences
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushedIndex = 0;  // Index to track elements in the pushed array
        int poppedIndex = 0;   // Index to track elements in the popped array

        // Iterate through the pushed array
        for (int value : pushed) {
            pushed[pushedIndex++] = value;  // Simulate the push operation by updating the pushed array

            // Check if the top element of the pushed array matches the next element to be popped
            while (pushedIndex > 0 && pushed[pushedIndex - 1] == popped[poppedIndex]) {
                pushedIndex--;  // If matched, simulate the pop operation by updating pushedIndex
                poppedIndex++;  // Move to the next element in the popped array
            }
        }

        // Check if all elements in the pushed array have been processed, indicating a valid sequence
        return pushedIndex == 0;
    }
}


/* Solution 1
TC -> O(N)
SC -> O(N)
*/

class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>(); // Stack to track '[' characters

        // Iterate through the characters in the input string
        for (char para : s.toCharArray()) {
            // If the stack is not empty and the current character is ']', pop from the stack
            if (!stack.isEmpty() && (stack.peek() == '[' && para == ']')) {
                stack.pop();
            }
            // If the current character is '[', push onto the stack
            else if (para == '[') {
                stack.push(para);
            }
        }

        // If the stack is empty, no swaps are needed
        if (stack.isEmpty()) {
            return 0;
        }

        // The number of swaps needed is half of the stack size (rounded up if odd)
        return (stack.size() + 1) / 2;
    }
}


/* Solution 2
TC -> O(N)
SC -> O(1)
*/


class Solution {
    public int minSwaps(String s) {
        int stack_size = 0; // Variable to track the balance of '[' and ']' characters

        // Iterate through the characters in the input string
        for (int i = 0; i < s.length(); i++) {
            // If the current character is '[', increment the stack size
            if (s.charAt(i) == '[') {
                stack_size++;
            } else {
                // If the current character is ']' and the stack is not empty, decrement the stack size
                if (stack_size > 0) {
                    stack_size--;
                }
            }
        }

        // The number of swaps needed is half of the remaining stack size (rounded up if odd)
        return (stack_size + 1) / 2;
    }
}




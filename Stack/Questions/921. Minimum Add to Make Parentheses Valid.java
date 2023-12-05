class Solution {
    // Method to calculate the minimum number of parentheses to add to make the sequence valid
    public int minAddToMakeValid(String s) {
        int stack_size = 0;   // Variable to represent the size of the stack
        int miss_match = 0;   // Variable to count the mismatched parentheses

        for (char parentheses : s.toCharArray()) {
            if (parentheses == '(') {
                stack_size++;  // Increase the stack size when an opening parenthesis is encountered
            } else if (parentheses == ')' && stack_size > 0) {
                stack_size--;  // If a closing parenthesis is encountered and the stack is not empty, match with an opening parenthesis
            } else {
                miss_match++;  // If there is no matching opening parenthesis for a closing parenthesis, increase the mismatch count
            }
        }
        
        return stack_size + miss_match;  // Return the total number of parentheses to be added for a valid sequence
    }
}

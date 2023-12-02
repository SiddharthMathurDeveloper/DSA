/*
Way One 
*/

class Solution {
    public boolean isValid(String s) {
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char parentheses : s.toCharArray()) {
            // If the character is an opening parenthesis, push it onto the stack
            if (isOpenParentheses(parentheses)) {
                stack.push(parentheses);
                continue;
            }

            // If the stack is not empty and the current parentheses matches with the top of the stack,
            // pop the top element from the stack, indicating a valid pair
            if (!stack.isEmpty() && isValidToPop(stack.peek(), parentheses)) {
                stack.pop();
            } else {
                // The current parentheses doesn't match with the top of the stack, indicating an invalid pair
                return false;
            }
        }

        // The string is valid if the stack is empty after processing all parentheses
        return stack.isEmpty();
    }

    // Helper method to check if a character is an opening parenthesis
    private boolean isOpenParentheses(char parentheses) {
        return parentheses == '(' || parentheses == '{' || parentheses == '[';
    }

    // Helper method to check if it's valid to pop the top element from the stack
    private boolean isValidToPop(char openParentheses, char closeParentheses) {
        return (openParentheses == '(' && closeParentheses == ')') ||
               (openParentheses == '[' && closeParentheses == ']') ||
               (openParentheses == '{' && closeParentheses == '}');
    }
}




/*
Way Two -> New Approach
*/

class Solution {
    public boolean isValid(String s) {
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<Character>();

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is an opening parenthesis, push the corresponding closing parenthesis onto the stack
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            // If the character is a closing parenthesis
            else if (stack.isEmpty() || stack.pop() != c)
                // If the stack is empty or the popped element doesn't match the current character, return false
                return false;
        }

        // The string is valid if the stack is empty after processing all parentheses
        return stack.isEmpty();
    }
}











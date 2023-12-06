class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> checker = new Stack<>();  // Stack to keep track of opening parentheses

        for (char parenthesis : x.toCharArray()) {
            if (parenthesis == '(') {
                checker.push(')');  // Push the matching closing parenthesis for an opening parenthesis
            } else if (parenthesis == '{') {
                checker.push('}');  // Push the matching closing parenthesis for an opening curly brace
            } else if (parenthesis == '[') {
                checker.push(']');  // Push the matching closing parenthesis for an opening square bracket
            } else if (checker.isEmpty() || checker.pop() != parenthesis) {
                // If the stack is empty or the top of the stack doesn't match the current closing parenthesis, brackets are not balanced.
                return false;
            }
        }

        // Brackets are balanced if the stack is empty at the end
        return checker.isEmpty();
    }
}

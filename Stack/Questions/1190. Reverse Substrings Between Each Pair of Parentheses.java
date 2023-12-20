/* Solution 1
TC -> O(N)
SC -> O(N^2)
*/

class Solution {
    public String reverseParentheses(String s) {
        // Initialize a stack to store the indices of '(' characters
        Stack<Integer> stack = new Stack<>();
        // Initialize a StringBuilder to store the result
        StringBuilder ans = new StringBuilder();

        // Iterate through the characters of the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // If the character is '(', push the current length of the result string to the stack
                stack.push(ans.length());
            } else if (s.charAt(i) == ')') {
                // If the character is ')', pop the index from the stack and reverse the substring between that index and the current length
                int j = stack.pop();
                reverseSubstring(ans, j, ans.length());
            } else {
                // If the character is neither '(' nor ')', append it to the result string
                ans.append(s.charAt(i));
            }
        }

        // The final result is the StringBuilder converted to a string
        return ans.toString();
    }

    // Helper method to reverse a substring within a StringBuilder
    private static void reverseSubstring(StringBuilder sb, int start, int end) {
        sb.replace(start, end, new StringBuilder(sb.substring(start, end)).reverse().toString());
    }
}




/* Solution 2
TC -> O(N)
SC -> O(N)
*/

class Solution {
    public String reverseParentheses(String s) {
        // Get the length of the input string
        int n = s.length();
        
        // Initialize a stack to store the indices of '(' characters
        Stack<Integer> stack = new Stack<>();
        
        // Initialize an array to store the pair indices for each '(' and ')'
        int[] pair = new int[n];
        
        // Iterate through the characters of the string to find the matching pairs of '(' and ')'
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                // If the character is '(', push its index to the stack
                stack.push(i);
            }

            if (s.charAt(i) == ')') {
                // If the character is ')', pop the index from the stack and set the pair indices
                int j = stack.pop();
                pair[i] = j; 
                pair[j] = i; 
            }
        }
        
        // Initialize a StringBuilder to store the result
        StringBuilder ans = new StringBuilder();
        
        // Initialize variables for iterating through the string and changing direction
        int i = 0, d = 1;

        // Iterate through the string using indices and direction
        while (i < n) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                // If the character is '(' or ')', jump to its pair and change direction
                i = pair[i];
                d = -d;
            }   
            else {
                // If the character is neither '(' nor ')', append it to the result
                ans.append(s.charAt(i));
            }
            // Move to the next character based on the current direction
            i += d;
        }

        // Convert the StringBuilder to a string and return the result
        return ans.toString();
    }
}


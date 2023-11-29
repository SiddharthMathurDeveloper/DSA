// Brute Force 

public class Solution {
    public int minLength(String s) {
        // Initialize index variable i to 0
        int i = 0;

        // Continue looping while i is less than the length of the string s
        while (i < s.length()) {
            // Check if there are at least two characters remaining in the string
            if (i + 1 < s.length()) {
                // Extract a substring of length 2 starting from index i
                String e = s.substring(i, i + 2);

                // Check if the substring is "AB" or "CD"
                if (e.equals("AB") || e.equals("CD")) {
                    // If a pair is found, create a StringBuilder from the string
                    StringBuilder sb = new StringBuilder(s);
                    
                    // Delete the pair of characters from the string
                    sb.delete(i, i + 2);

                    // Update the string s with the modified version
                    s = sb.toString();

                    // Reset the index to 0 to start checking from the beginning
                    i = 0;
                } else {
                    // If the substring is not "AB" or "CD", increment the index
                    i++;
                }
            } else {
                // If there is only one character remaining, increment the index
                i++;
            }
        }

        // Return the length of the modified string
        return s.length();
    }
}



// Optimal Code


class Solution {
    public int minLength(String s) {
        // Create a stack to keep track of characters
        Stack<Character> stack = new Stack<>();

        // Initialize a count variable to keep track of characters left after removal
        int count = 0;

        // Loop through each character in the string
        for (char letter : s.toCharArray()) {
            // Check if the stack is not empty and the current character forms a pair with the top of the stack
            if (!stack.isEmpty() && ((stack.peek() == 'A' && letter == 'B') || (stack.peek() == 'C' && letter == 'D'))) {
                // If a pair is found, pop the character from the stack
                stack.pop();
            } else {
                // If no pair is found, push the current character onto the stack
                stack.push(letter);
            }
        }

        // The size of the stack represents the minimum length after removal
        return stack.size();
    }
}
















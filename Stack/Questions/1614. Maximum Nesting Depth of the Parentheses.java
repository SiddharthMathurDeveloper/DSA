class Solution {
    public int maxDepth(String s) {
        // Get the length of the input string
        int sLength = s.length();

        // Initialize variables to track the maximum depth and the count of left parentheses
        int maxDepthOfParentheses = 0;
        int countLeftParentheses = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < sLength; i++) {
            char currentCharacter = s.charAt(i);

            // If the current character is '(', increment the count of left parentheses
            if (currentCharacter == '(') {
                countLeftParentheses++;

                // Update the maximum depth based on the current count of left parentheses
                maxDepthOfParentheses = Math.max(maxDepthOfParentheses, countLeftParentheses);
            }
            // If the current character is ')', decrement the count of left parentheses
            else if (currentCharacter == ')') {
                countLeftParentheses--;
            }
        }

        // Return the maximum depth of parentheses
        return maxDepthOfParentheses;
    }
}

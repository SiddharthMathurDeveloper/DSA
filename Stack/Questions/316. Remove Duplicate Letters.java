
/* Solution 
TC -> O(N)
SC -> O(N)
*/
class Solution {
    public String removeDuplicateLetters(String s) {
        // Array to store the frequency of each letter in the string
        int[] freq = new int[26];
        // Array to keep track of whether a letter has been included in the result or not
        boolean[] seen = new boolean[26];
        // Initialize the 'seen' array with false values
        Arrays.fill(seen, false);

        // Count the frequency of each letter in the string
        for (char letter : s.toCharArray()) {
            freq[letter - 'a']++;
        }

        // Stack to store the final result
        Stack<Character> stack = new Stack<>();

        // Iterate through each letter in the string
        for (char letter : s.toCharArray()) {
            freq[letter - 'a']--; // Decrement the frequency of the current letter

            // If the letter is already included in the result, skip it
            if (seen[letter - 'a']) {
                continue;
            }

            // Pop letters from the stack if they are greater than the current letter
            // and there are more occurrences of them later in the string
            while (!stack.isEmpty() && stack.peek() > letter && freq[stack.peek() - 'a'] > 0) {
                seen[stack.peek() - 'a'] = false; // Mark the popped letter as not seen
                stack.pop();
            }

            // Push the current letter onto the stack and mark it as seen
            stack.push(letter);
            seen[letter - 'a'] = true;
        }

        // Build the final result by appending letters from the stack
        StringBuilder ans = new StringBuilder();
        for (char letter : stack) {
            ans.append(letter);
        }

        return ans.toString();
    }
}

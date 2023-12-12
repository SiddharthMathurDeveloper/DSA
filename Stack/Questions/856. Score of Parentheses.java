/* Solution 1
TC -> O(N)
SC -> O(N)
*/

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>(); // Stack to store scores
        int score = 0;

        for (char parenthese : s.toCharArray()) {
            if (parenthese == '(') {
                stack.push(score); // Push the current score onto the stack
                score = 0; // Reset the score for the new parentheses sequence
            } else {
                // Calculate the new score based on the formula: current_score = previous_score + max(2 * current_score, 1)
                score = stack.peek() + Math.max(2 * score, 1);
                stack.pop(); // Pop the previous score from the stack
            }
        }

        return score;
    }
}

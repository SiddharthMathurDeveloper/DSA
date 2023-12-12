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

/* Solution 2
TC -> O(N)
SC -> O(N)
*/


class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0; // Initialize the total score
        int depth = 0; // Initialize the current depth of nested parentheses

        char previousParenthese = '('; // Keep track of the previous parenthesis to determine the score

        for (char parenthese : s.toCharArray()) {
            if (parenthese == '(') {
                depth++; // Increase the depth for an opening parenthesis
            } else {
                depth--; // Decrease the depth for a closing parenthesis
                if (previousParenthese == '(') {
                    // If the previous parenthesis was an opening parenthesis, update the score based on the current depth
                    score += Math.pow(2, depth);
                }
            }

            previousParenthese = parenthese; // Update the previous parenthesis
        }

        return score; // Return the total score
    }
}
